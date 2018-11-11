package com.inspire.AbstractShapeFactory;

public class InvalidShapeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidShapeException(String exceptionStr){
		System.out.println(exceptionStr);
	}
}
