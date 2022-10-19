package com.hexaware.onetomanydemo.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.onetomanydemo.entity.Book;
import com.hexaware.onetomanydemo.exception.ResourceNotFoundException;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> getBookById(Long bookid) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBookById(Long bookid) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book updateBookById(Book book, Long bookid) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book saveBookById(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
