package com.inspire.prototype;

public class PrototypeDemo {
	
	public static void main(String args[]){
		ShapeCache.loadCache();
		AbstractShape triange =(AbstractShape) ShapeCache.getShape("2");
		Circle circle =(Circle) ShapeCache.getShape("1");
		circle.draw();
		triange.draw();
	}

}
