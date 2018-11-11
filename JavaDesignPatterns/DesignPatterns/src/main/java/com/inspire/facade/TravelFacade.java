package com.inspire.facade;

public class TravelFacade {
	
	private HotelBooker hotelbooker=new HotelBooker();
	private FlightBooker flightbooker=new FlightBooker();
	
	public void getFlightsAndHotels(String from, String to, String type){
		hotelbooker.getHotels(type,to);
		flightbooker.getFlights(from, to);
	}

}
