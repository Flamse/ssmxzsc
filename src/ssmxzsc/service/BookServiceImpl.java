package ssmxzsc.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssmxzsc.mapper.BookMapper;
import ssmxzsc.mapper.CollectMapper;
import ssmxzsc.po.Book;
@Service
public class BookServiceImpl implements BookService {
	@Resource
	private BookMapper bookMapper;
	@Resource
	private CollectMapper collectMapper;
	
	@Override
	public List<Book> loadAllBook() {
		// TODO Auto-generated method stub
		return bookMapper.selectAll();
	}

	@Override
	public boolean addToCart(Book book) {
		// TODO Auto-generated method stub
		if(bookMapper.insertSelective(book)==1)
			return true;
		return false;
	}

	public List<Book> getBookByUserId(String userId){
		List<Book> books=bookMapper.selectByUserId(userId);
		
		return books;
	}

}
