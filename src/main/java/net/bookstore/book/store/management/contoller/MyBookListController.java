package net.bookstore.book.store.management.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.bookstore.book.store.management.serivces.MyBookService;

@Controller
public class MyBookListController {
	
	@Autowired
	private MyBookService service;
	
	@RequestMapping("/deleteMyList/{id}") 
	public String deleteMYList(@PathVariable("id")int id) {
		service.deleteById(id);
		return "redirect:/my_books";
	}
}
