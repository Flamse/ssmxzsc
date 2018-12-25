package ssmxzsc.mapper;

import ssmxzsc.po.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}