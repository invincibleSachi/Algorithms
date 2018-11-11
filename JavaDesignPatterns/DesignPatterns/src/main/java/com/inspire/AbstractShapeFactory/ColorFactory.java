package com.inspire.AbstractShapeFactory;

public class ColorFactory {
	public Color getColor(String color){
		if (color.equalsIgnoreCase("GREEN")){
			return new GreenColor();
		}else if(color.equalsIgnoreCase("RED")){
			return new RedColor();
		}else if(color.equalsIgnoreCase("BLUE")){
			return new BlueColor();
		}else{
			try {
				throw new InvalidColorException("The given shape is not valid");
			} catch (InvalidColorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public Shape getShape(String shape) {
		return null;
		
	}
}
