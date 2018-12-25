package ssmxzsc.mapperOld;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import ssmxzsc.entity.User;
import ssmxzsc.util.MybatisUtil;

public interface UserMapper {
	public User selectUser_byPhone(String phone);
	public void insertUser(Map<String,Object> map);
	
	public static void main(String[] args) {
		SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
		UserMapper userDao = sqlSession.getMapper(UserMapper.class);
//		UserDaoImpl UserDao = new UserDaoImpl();
//		User user = new User();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("email","user04@tedu.cn");
		map.put("phone","12345678921");
		map.put("role",0);
		map.put("uname","user05");
		map.put("upwd","000000");
		userDao.insertUser(map);
		sqlSession.commit();
		System.out.println("success!");
	}
}
