package Methods;

import java.util.Scanner;
//Create a method called next3 . 
//This method has an int argument and prints the next 3 numbers after that number. 
//Call the method from main method and pass num to it.

public class PrintNext3Numbers {
	
	public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     System.out.println("enter number");
	     int num = inp.nextInt();
	     
	     next3(num);
	}
	     
	public static void next3(int number) {
		
		System.out.println("next 3 are:");
		String numbers= (number+1)+ " "+ (number+2)+ " "+ (number+3);
		System.out.println(numbers);
		
		
	}
	     
	     
	}

