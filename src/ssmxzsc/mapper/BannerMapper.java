package ssmxzsc.mapper;

import ssmxzsc.po.Banner;

public interface BannerMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
}