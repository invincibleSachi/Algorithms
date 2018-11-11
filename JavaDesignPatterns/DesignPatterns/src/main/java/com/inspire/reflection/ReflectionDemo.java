package com.inspire.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
	
	public static void main(String args[]){
		try {
			Class calc=Class.forName("Calculator");
			System.out.println(calc.getName());
			System.out.println(calc.getSimpleName());
			
			Class superclass=calc.getSuperclass();
			System.out.println("Super Class of calc " + superclass.getName());
			
			Field field=calc.getDeclaredField("type");
			System.out.println("field " + field.toString());
			
			Class[] interfaces=calc.getInterfaces();
			Constructor[] constructor=calc.getConstructors();
			
			Method[] methods=calc.getMethods();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
