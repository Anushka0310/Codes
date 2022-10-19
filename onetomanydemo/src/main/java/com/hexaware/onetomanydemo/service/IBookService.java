package com.hexaware.onetomanydemo.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.onetomanydemo.entity.Book;
import com.hexaware.onetomanydemo.exception.ResourceNotFoundException;

public interface IBookService {

	public List<Book> findAllBooks();
	public Optional<Book> getBookById(Long bookid)throws ResourceNotFoundException;
	public void deleteBookById(Long bookid)throws ResourceNotFoundException;
	public Book updateBookById(Book book,Long bookid)throws ResourceNotFoundException;
	public Book saveBookById(Book book);
	
	
}
