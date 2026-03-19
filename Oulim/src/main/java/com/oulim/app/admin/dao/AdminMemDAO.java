package com.oulim.app.admin.dao;

import org.apache.ibatis.session.SqlSession;

import com.oulim.app.config.MyBatisConfig;

public class AdminMemDAO {
	
	public SqlSession sqlSession;
	
	
    public AdminMemDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
    }

    
    
    
}
