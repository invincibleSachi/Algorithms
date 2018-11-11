package com.inspire.factory;

public class FactoryDemo {
	
	public static void main(String args[]){
		ShapeFactory factory=new ShapeFactory();
		Shape shape=factory.getShape("CIRCLE");
		shape.draw();
	}
	

}
