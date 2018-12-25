package ssmxzsc.mapper;

import ssmxzsc.po.Book;

public interface BookMapper {
    int deleteByPrimaryKey(String isbn);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(String isbn);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}