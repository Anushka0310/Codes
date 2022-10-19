package com.hexaware.onetoonedemo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.onetoonedemo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
