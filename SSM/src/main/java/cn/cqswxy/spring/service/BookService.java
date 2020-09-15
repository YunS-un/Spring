package cn.cqswxy.spring.service;

import java.util.List;

import cn.cqswxy.spring.entity.Book;

public interface BookService {

	List<Book> getAll();
	
	Book getOne(Integer bookId);
	
	int delOne(Integer bookId);
	
	int addOne(Book book);
	
	int modOne(Book book);
}
