package edu.ilstu;

public class Reservation
{
	private String name;
	private int reservationNumber; 
	Route departureRoute = new Route(); 
	Route returnRoute = new Route(); 
	
	public Reservation(){
		
	}
	
	public Reservation(String name, int reservationNumber){
		this.name = name; 
		this.reservationNumber = reservationNumber; 
	}
	
	public String toString(){
		return "Reservation name  Reservation number\n" + name + "        " + reservationNumber;
	}
	
	public boolean equals(Reservation resNum2){
		if(reservationNumber == resNum2.reservationNumber){
			return true; 
		}
		else{
			return false;
		}
	}
}
