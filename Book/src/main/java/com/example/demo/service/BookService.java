package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo br;
	public void addNewBook(Book book) {
		// TODO Auto-generated method stub
		br.save(book);
		
	}

}
