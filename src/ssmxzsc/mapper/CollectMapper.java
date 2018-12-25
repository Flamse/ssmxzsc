package ssmxzsc.mapper;

import ssmxzsc.po.Collect;

public interface CollectMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
}