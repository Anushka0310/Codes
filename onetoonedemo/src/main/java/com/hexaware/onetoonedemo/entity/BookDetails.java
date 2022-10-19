package com.hexaware.onetoonedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_details")
public class BookDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookdetails_id")
	private Long bookDetailsId;
	
	@Column(name = "book_author")
	private String bookAuthor;
	
	@Column(name = "book_desc")
	private String bookDesc;
	
	public BookDetails() {
		// TODO Auto-generated constructor stub
	}

	public BookDetails(Long bookDetailsId, String bookAuthor, String bookDesc) {
		super();
		this.bookDetailsId = bookDetailsId;
		this.bookAuthor = bookAuthor;
		this.bookDesc = bookDesc;
	}

	public BookDetails(String bookAuthor, String bookDesc) {
		super();
		this.bookAuthor = bookAuthor;
		this.bookDesc = bookDesc;
	}

	public Long getBookDetailsId() {
		return bookDetailsId;
	}

	public void setBookDetailsId(Long bookDetailsId) {
		this.bookDetailsId = bookDetailsId;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
	
	
	

}
