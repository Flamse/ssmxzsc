package ssmxzsc.service;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssmxzsc.mapper.AddressMapper;
import ssmxzsc.po.Address;

@Service
public class AddressServiceImpl implements AddressService {
	@Resource
	private AddressMapper addressMapper;
	
	@Override
	public boolean addAddress(Address address) {
		// TODO Auto-generated method stub
		//获取时间对象
		java.util.Date date = new java.util.Date();
		System.out.println(date);
		Timestamp timestamp = new Timestamp(date.getTime());
		System.out.println(timestamp);
		address.setAdded(timestamp);
		if(addressMapper.insertSelective(address)==1)
			return true;
		return false;
	}

}
