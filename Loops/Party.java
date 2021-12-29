package Loops;

import java.util.Scanner;

public class Party {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	String guest = "";
	String guests = "";
	String feedback= "";

	
	do {
		System.out.println("Please enter guest name:");
		guest=input.nextLine();
		guests=guests +guest+", ";
		System.out.println("Do you want to enter new guest name:");
		feedback=input.nextLine();
	}while(feedback.equalsIgnoreCase("yes")) ;
	System.out.println("Guest's list: " + guests.substring(0, guests.length() - 2));
		
	
	

}
}

