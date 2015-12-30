package com.willcode4coffee.creationalpatterns.factory;


/**
 * 
 * @author junaidpasha
 *
 */
public class ReservationFactory {
	
	public Reservation createReservation(String reservationType) { 
		
		Reservation reservation = null;
		
		if(reservationType == "airline") { 
			reservation = new AirlineReservation();
		}
		else if(reservationType == "train") { 
			
			reservation = new TrainReservation();
		}
		else if (reservationType == "bus") { 
			reservation = new BusReservation();
		}
		
		return reservation;
	}
	
	

}
