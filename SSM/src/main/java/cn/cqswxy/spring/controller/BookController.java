package cn.cqswxy.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.cqswxy.spring.entity.Book;
import cn.cqswxy.spring.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("mainPage")
	public ModelAndView mainPage(ModelAndView modelAndView){
		modelAndView.addObject("list", bookService.getAll());
		modelAndView.setViewName("/WEB-INF/jsp/mainPage.jsp");
		return modelAndView;
	}
	
	@RequestMapping("deleteSubmit")
	public ModelAndView deleteSubmit(ModelAndView modelAndView,Integer bookId){
		modelAndView.addObject("list", bookService.delOne(bookId));
		modelAndView.setViewName("redirect:mainPage.do");
		return modelAndView;
	}
	
	@RequestMapping("insertPage")
	public ModelAndView insertPage(ModelAndView modelAndView){
		modelAndView.setViewName("/WEB-INF/jsp/insertPage.jsp");
		return modelAndView;
	}
	
	@RequestMapping("insertSubmit")
	public ModelAndView insertSubmit(ModelAndView modelAndView,Book book){
		bookService.addOne(book);
		modelAndView.setViewName("redirect:mainPage.do");
		return modelAndView;
	}
	
	@RequestMapping("updatePage")
	public ModelAndView updatePage(ModelAndView modelAndView,Integer bookId){
		Book book = bookService.getOne(bookId);
		modelAndView.addObject("book",book);
		modelAndView.setViewName("/WEB-INF/jsp/updatePage.jsp");
		return modelAndView;
	}
	
	@RequestMapping("updateSubmit")
	public ModelAndView updateSubmit(ModelAndView modelAndView,Book book){
		bookService.modOne(book);
		modelAndView.setViewName("redirect:mainPage.do");
		return modelAndView;
	}
	
	
}
