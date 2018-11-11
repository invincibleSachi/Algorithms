package com.inspire.singleton;

public class Singleton {
	
	private static Singleton singletonObj;
	
	private Singleton(){

	}
	public static Singleton getInstance(){
		if(singletonObj==null){
			singletonObj=new Singleton();
		}
		return singletonObj;
	}
	
	public void printMsg(){
		System.out.println("Hello from Singleton");
	}
}
