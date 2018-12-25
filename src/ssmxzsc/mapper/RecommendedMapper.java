package ssmxzsc.mapper;

import ssmxzsc.po.Recommended;

public interface RecommendedMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Recommended record);

    int insertSelective(Recommended record);

    Recommended selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Recommended record);

    int updateByPrimaryKey(Recommended record);
}