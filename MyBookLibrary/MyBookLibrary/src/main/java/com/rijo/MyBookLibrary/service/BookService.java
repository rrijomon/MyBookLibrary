package com.rijo.MyBookLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rijo.MyBookLibrary.model.Book;
import com.rijo.MyBookLibrary.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
}
