package ssmxzsc.mapper;

import ssmxzsc.po.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}