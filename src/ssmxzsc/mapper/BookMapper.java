package ssmxzsc.mapper;

import java.util.List;

import ssmxzsc.po.Book;

public interface BookMapper {
    int deleteByPrimaryKey(String isbn);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(String isbn);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
    /**
     * 查询所有图书信息
     * @return 返回所有图书对象的集合
     */
    List<Book> selectAll();

	List<Book> selectByUserId(String userId);
}