package com.inspire.prototype;

public class Circle extends AbstractShape {

	public Circle(){
		this.type="CIRCLE";
	}


	@Override
	public void draw() {
		System.out.println("CIRCLE is drawn");
		
	}
	

}
