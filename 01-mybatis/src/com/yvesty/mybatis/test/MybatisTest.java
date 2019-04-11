package com.yvesty.mybatis.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.yvesty.mybatis.pojo.User;
import com.yvesty.mybatis.utils.SqlSessionFactoryUtils;

public class MybatisTest {
	
	@Test
	public void testGetUserById() throws Exception {
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		//创建核心配置文件的输入流
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		//通过输入流创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = ssfb.build(inputStream);
		//创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Object user = sqlSession.selectOne("user.getUserById", 1);
		
		System.out.println(user);
		
		sqlSession.close();
		
	}
	
	@Test
	public void testGetUserByUserName() {
	//获取SqlSessionFactory
	SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();	
	
	SqlSession sqlSession = sqlSessionFactory.openSession();
	List<User> list = sqlSession.selectList("user.getUserByUserName", "%张%");
	for (User user : list) {
		System.out.println(user);
	}
	sqlSession.close();
	
	
	}
}
