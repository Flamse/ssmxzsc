package ssmxzsc.service;

import java.util.List;

import ssmxzsc.po.Book;

public interface BookService {
	/**
	 * 返回所有图书
	 * @return 图书集合
	 */
	public List<Book> loadAllBook();
	/**
	 * 加入购物车
	 * @param book
	 * @return
	 */
	public boolean addToCart(Book book);

	public List<Book> getBookByUserId(String userId);
}
