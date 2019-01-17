package ssmxzsc.service;

import ssmxzsc.po.User;

public interface UserService {
	/**
	 * 查询用户名是否存在
	 * @param uname
	 * @return 用户名存在返回true
	 */
	boolean unameCheck(String uname);
	/**
	 * 查询email是否存在
	 * @param email
	 * @return email存在返回true
	 */
	boolean emailCheck(String email);
	/**
	 * 查询主键（phone）是否存在
	 * @param phone
	 * @return	phone存在返回true
	 */
	boolean phoneCheck(String phone);
	/**
	 * 添加用户
	 * @param user
	 * @return 添加成功返回true
	 */
	boolean plusUser(User user);
	/**
	 * 用户登录匹配
	 * @param user 
	 * @return 按用户名匹配密码，成功返回true
	 */
	User login(User user);
	/**
	 * 查询用户密码是否正确
	 * @param user
	 * @return 查询成功返回true
	 */
	boolean uaccountCheck(User user);
	/**
	 * 用户修改密码
	 * @param user
	 * @return 修改成功返回true
	 */
	boolean changePassword(User user);
	
}
