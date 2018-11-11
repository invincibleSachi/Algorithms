package com.inspire.factory;

public class ShapeFactory {
	
	public Shape getShape(String shape){
		if (shape.equalsIgnoreCase("TRIANGLE")){
			return new Triangle();
		}else if(shape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shape.equalsIgnoreCase("SQUARE")){
			return new Square();
		}else{
			try {
				throw new InvalidShapeException("The given shape is not valid");
			} catch (InvalidShapeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
