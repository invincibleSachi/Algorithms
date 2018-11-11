package com.inspire.prototype;

public class Square extends AbstractShape {

	public Square(){
		this.type="SQUARE";
	}
	

	@Override
	public void draw() {
		System.out.println("SQuare is drawn");
		
	}

}
