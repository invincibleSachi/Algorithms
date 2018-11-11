package com.inspire.facade;

public class Flights {
	
	private String from;
	private String to;
	
	public Flights(String from, String to){
		this.from=from;
		this.to=to;
	}
	
	public String getFlight(){
		//process to get flight;
		return "myFlight";
	}

}
