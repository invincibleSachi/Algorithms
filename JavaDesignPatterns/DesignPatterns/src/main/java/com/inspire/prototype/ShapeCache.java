package com.inspire.prototype;

import java.util.Hashtable;

public class ShapeCache {
	
	public static Hashtable<String,AbstractShape> shapeCache=new Hashtable<String,AbstractShape>();
	
	public static void loadCache(){
		shapeCache.put("1", new Circle());
		shapeCache.put("2", new Triangle());
		shapeCache.put("3", new Square());
	}
	
	public static Object getShape(String id){
		return shapeCache.get(id).clone();
	}

}
