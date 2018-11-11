package com.inspire.AbstractShapeFactory;

public class InvalidColorException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5339114685097915754L;

	public InvalidColorException(String errmsg){
		System.out.println(errmsg);
	}

}
