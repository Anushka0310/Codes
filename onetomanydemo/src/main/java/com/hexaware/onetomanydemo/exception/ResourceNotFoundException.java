package com.hexaware.onetomanydemo.exception;

public class ResourceNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String exMsg) {
		super(exMsg);
	}

}
