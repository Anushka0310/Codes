package com.hexaware.onetomanydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.onetomanydemo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
