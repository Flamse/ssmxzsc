package ssmxzsc.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssmxzsc.mapper.UserMapper;
import ssmxzsc.po.User;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	@Override
	public boolean unameCheck(String uname) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByName(uname);
		if(user!=null)
			return true;
		return false;
	}

	@Override
	public boolean emailCheck(String email) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByEmail(email);
		if(user!=null)
			return true;
		return false;
	}

	@Override
	public boolean phoneCheck(String phone) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(phone);
		if(user!=null)
			return true;
		return false;
	}

	@Override
	public boolean plusUser(User user) {
		// TODO Auto-generated method stub
		user.setRole(0);
		int a = userMapper.insert(user);
		System.out.println(a);
		if(a==1)
			return true;
		return false;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
//		User userReturn = userMapper.selectByName(user.getUname());
		//打印user
		//System.out.println(userReturn.toString());//问题不在这
		//问题出在if语句，信息核对过程判错了
//		if(userReturn!=null && user.getUpwd().equals(userReturn.getUpwd()))
//			return true;
//		return false;
		User userReturn = userMapper.selectByUser(user);
		return userReturn;
	}

	@Override
	public boolean changePassword(User user) {
		// TODO Auto-generated method stub
		if(userMapper.updateByUser(user)==1)
			return true;
		return false;
	}

	@Override
	public boolean uaccountCheck(User user) {
		// TODO Auto-generated method stub
		if(null!=userMapper.selectByUser(user))
			return true;
		return false;
	}


}