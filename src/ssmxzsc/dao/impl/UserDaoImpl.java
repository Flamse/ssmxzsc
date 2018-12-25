package ssmxzsc.dao.impl;

import org.apache.ibatis.session.SqlSession;

import ssmxzsc.entity.User;
import ssmxzsc.mapperOld.UserMapper;
import ssmxzsc.util.MybatisUtil;

public class UserDaoImpl implements UserMapper {
	public static void main(String[] args) {
		UserDaoImpl UserDao = new UserDaoImpl();
		User user = new User();
		user.setEmail("user03@tedu.cn");
		user.setPhone("12345678916");
		user.setRole(0);
		user.setUname("user03");
		user.setUpwd("000000");
		UserDao.insertUser(user);
	}
	@Override
	public User selectUser_byPhone(String phone) {
		// TODO Auto-generated method stub
		//获取SqlSession,使用Util类
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
				
		//查询操作
		User user = sqlSession.selectOne("ssmxzsc.dao.UderDao.selectUser_byPhone", phone);
		System.out.println(user.toString());
		
		//提交
		sqlSession.commit();
		
		//关闭SqlSession
		sqlSession.close();
		return user;
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		//获取SqlSession,使用Util类
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
		
		//执行持久化操作
		sqlSession.insert("ssmxzsc.dao.UserDao.insertUser", user);
		
		//提交
		sqlSession.commit();
		
		//关闭SqlSession
		sqlSession.close();
	}

}
