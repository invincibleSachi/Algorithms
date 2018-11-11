package com.inspire.prototype;

public class Triangle extends AbstractShape {

	public Triangle(){
		this.type="TRIANGLE";
	}

	@Override
	public void draw() {
		System.out.println("A Triangle is drawn");
		
	}

}
