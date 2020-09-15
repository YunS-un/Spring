package cn.cqswxy.spring.mapper;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import cn.cqswxy.spring.entity.Book;

@Repository
public interface BookMapper {

	ArrayList<Book> selectAll();
	
	Book selectOne(Integer bookId);
	
	int deleteOne(Integer bookId);
	
	int insertOne(Book book);
	
	int updateOne(Book book);
}
