package ssmxzsc.mapper;

import ssmxzsc.po.OrderItem;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}