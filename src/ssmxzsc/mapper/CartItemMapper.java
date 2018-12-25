package ssmxzsc.mapper;

import ssmxzsc.po.CartItem;

public interface CartItemMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(CartItem record);

    int insertSelective(CartItem record);

    CartItem selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(CartItem record);

    int updateByPrimaryKey(CartItem record);
}