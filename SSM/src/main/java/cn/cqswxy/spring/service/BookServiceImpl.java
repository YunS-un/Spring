package cn.cqswxy.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cqswxy.spring.entity.Book;
import cn.cqswxy.spring.mapper.BookMapper;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	
	public List<Book> getAll() {
		return bookMapper.selectAll();
	}

	public Book getOne(Integer bookId) {
		return bookMapper.selectOne(bookId);
	}

	public int addOne(Book book) {
		return bookMapper.insertOne(book);
	}

	public int delOne(Integer bookId) {
		return bookMapper.deleteOne(bookId);
	}

	public int modOne(Book book) {
		return bookMapper.updateOne(book);
	}

}
