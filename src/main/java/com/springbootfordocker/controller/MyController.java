package com.springbootfordocker.controller;

import com.springbootfordocker.dao.UserDao;
import com.springbootfordocker.model.UserEntity;
import com.springbootfordocker.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
public class MyController {
    @Value("${env}")
    private String env;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private UserDao userDao;

    @GetMapping("index")
    public String index(){
        return "hello docker with "+env;
    }

    @PostMapping("user/save")
    public String save(UserEntity userEntity){
        userEntity.setCreateTime(new Date());
        redisUtil.set(userEntity.getName(),userEntity);
        return "save success";
    }

    @GetMapping("user/get/{name}")
    public UserEntity get(@PathVariable String name){
        return (UserEntity)redisUtil.get(name);
    }

    @GetMapping("user/getAll")
    public List<UserEntity> getAll(){
        return userDao.findAll();
    }
}
