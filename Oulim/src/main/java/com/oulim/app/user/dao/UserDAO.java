package com.oulim.app.user.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.oulim.app.user.dto.UserDTO;
import com.oulim.app.user.mapper.UserMapper;

public class UserDAO {
    SqlSession sqlSession;

    public UserDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
    }

    public UserDTO login(String userId, String userPw) {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.login(userId, userPw);
    }
}