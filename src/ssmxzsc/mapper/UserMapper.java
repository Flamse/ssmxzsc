package ssmxzsc.mapper;

import ssmxzsc.po.User;

public interface UserMapper {
    int deleteByPrimaryKey(String phone);
    /**
     * 增加记录（用户）
     * @param record
     * @return 添加成功返回1
     */
    int insert(User record);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /**
     * 查询用户
     * @param user
     * @return 查询成功返回user
     */
    User selectByUser(User user);
    /**
     * 根据主键（电话号码）查询用户
     * @param phone
     * @return 匹配成功返回User
     */
    User selectByPrimaryKey(String phone);
    /**
     * 根据用户名查询用户
     * @param uname
     * @return 匹配成功返回User
     */
    User selectByName(String uname);
    /**
     * 根据email查询用户
     * @param email
     * @return 匹配成功返回User
     */
	User selectByEmail(String email);
	/**
	 * 根据用户信息修改用户信息
	 * @param user
	 */
	int updateByUser(User user);
}