package Statements;

import java.util.Scanner;

public class TipCalculator {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Split:");
	String splitCheck = sc.next();

	System.out.println("Number of people:");
	int numberOfPeople = sc.nextInt();

	System.out.println("Check amount:");
	double checkAmount = sc.nextDouble();

	System.out.println("Service Quality:");
	String serviceQuality = sc.next();

	double totalPay, totalTip = 0, totalPerPerson, tipPerPerson;

	switch (serviceQuality) {
	case "Poor":
		totalTip = checkAmount * 0.05;
		break;

	case "Fair":
		totalTip = checkAmount * 0.1;
		break;

	case "Good":
		totalTip = checkAmount * 0.15;
		break;

	case "Great":
		totalTip = checkAmount * 0.20;
		break;

	case "Excellent":
		totalTip = checkAmount * 0.25;
		break;
	}

	totalPay = checkAmount + totalTip;
	totalPerPerson = totalPay / numberOfPeople;
	tipPerPerson = totalTip / numberOfPeople;

	System.out.print("Number of people entered: ");

	while (numberOfPeople > 0) {
		numberOfPeople--;
		System.out.print("&");
	}

	System.out.println();

	System.out.println("Total to pay: " + totalPay);
	System.out.println("Total tip: " + totalTip);

	switch (splitCheck) {
	case "Yes":
		System.out.println("Total per person: " + totalPerPerson);
		System.out.println("Tip per person: " + tipPerPerson);
		break;
	}

}

}



