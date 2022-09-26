package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bs;
	
	@RequestMapping("/add")
	public String addNewBook() {
		return "BookForm.jsp";
	}
	@GetMapping("/savebook")
	public String savingBook(Book book,Model model) {
		bs.addNewBook(book);
		model.addAttribute("dbs_book", "Successfully Added New Book!!");
		return "BookForm.jsp";
	}
}
