package ssmxzsc.service;

import ssmxzsc.po.Address;

public interface AddressService {
	/**
	 * 用户添加地址
	 * @param address
	 * @return 添加成功返回true
	 */
	boolean addAddress(Address address);

}
