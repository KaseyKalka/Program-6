package edu.ilstu;

import java.util.Scanner;

public class Track
{
	int[] A = new int[50];
	TrackInput input = new TrackInput(); 
	
	//Print Menu.
	public void getUserChoice(Scanner scan){
		System.out.println("What would you like to do?");
		System.out.println("1: Add a reservation.");
		System.out.println("2: Print the itinerary of one person.");
		System.out.println("3: Print all itineraries?");
		System.out.println("4: Write list to file.");
		
		int choice = scan.nextInt();
		if(choice == 1){
			input.addReservation(); 
		}else if(choice == 2){
			input.printOnePerson();
		}else if(choice == 3){
			input.printAll(); 
		}else if(choice == 4){
			input.printList(); 
		}else{
			System.out.println("Please use an integer 1-4 to make your choice");
		}
	}
}
