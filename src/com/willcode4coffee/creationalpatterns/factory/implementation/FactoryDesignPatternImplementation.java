package com.willcode4coffee.creationalpatterns.factory.implementation;

import com.willcode4coffee.creationalpatterns.factory.Reservation;
import com.willcode4coffee.creationalpatterns.factory.ReservationFactory;

public class FactoryDesignPatternImplementation {
	
	
	public static void main(String args[]) { 
		
		// If the Travel is Airline. We need a AirlineReservation
		
		  ReservationFactory reservationfactory = new ReservationFactory();
		  Reservation reservation  = reservationfactory.createReservation("airline");
		   System.out.println(reservation.thingsTodo());
		  
		
		
	}

}
