package com.springbootfordocker.dao;

import com.springbootfordocker.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<UserEntity> findAll() {
        String sql = "SELECT id,pwd,name,age,createTime FROM userInfo";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(UserEntity.class));
    }
}
