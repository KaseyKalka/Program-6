package edu.ilstu;

public class Route
{
	private int routeNumber; 
	private String routeDate; 
	private String departureTrack; 
	private String arrivalTrack; 
	private String departureTime; 
	private String arrivalTime; 
	private String seatAssignment;
	
	//Getters and setter. 
	public int getRouteNumber()
	{
		return routeNumber;
	}
	public void setRouteNumber(int routeNumber)
	{
		this.routeNumber = routeNumber;
	}
	public String getRouteDate()
	{
		return routeDate;
	}
	public void setRouteDate(String routeDate)
	{
		this.routeDate = routeDate;
	}
	public String getDepartureTrack()
	{
		return departureTrack;
	}
	public void setDepartureTrack(String departureTrack)
	{
		this.departureTrack = departureTrack;
	}
	public String getDepartureArrival()
	{
		return arrivalTrack;
	}
	public void setDepartureArrival(String arrivalTrack)
	{
		this.arrivalTrack = arrivalTrack;
	}
	public String getDepartureTime()
	{
		return departureTime;
	}
	public void setDepartureTime(String departureTime)
	{
		this.departureTime = departureTime;
	}
	public String getArrivalTime()
	{
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime)
	{
		this.arrivalTime = arrivalTime;
	}
	public String getSeatAssignment()
	{
		return seatAssignment;
	}
	public void setSeatAssignment(String seatAssignment)
	{
		this.seatAssignment = seatAssignment;
	} 
	
	public String toString(){
		return "Departure Route\n" + "Route Number   " + "Route Date  " + "Departure Track   " 
				+ "Arrival Track   " + "Departure Time   " + "Arrival Time   " + "Seat\n" + routeNumber 
				+ "     " + routeDate + "    " + departureTrack + "     " + arrivalTrack + "     " + 
				departureTime + "     " + arrivalTime + "     " + seatAssignment; 
	}

	public boolean equals(Route rN2, Route rD2){
		if(routeNumber == rN2.routeNumber && routeDate == rD2.routeDate){
				return true; 
		}
		else{
			return false; 
		}
	}
}
