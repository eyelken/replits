package String;

import java.util.Scanner;

public class StringSMSMessage {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String message = "Sender:<Mike Smith>.From Number:[202-123-3456]. Message:{I love programing and problem solving}";
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
//	    Given a String message in the following format: Sender:<Mike Smith>. 
//	    From Number:[202-123-3456]. Message:{I love programing and problem solving} assign the value of the sender, 
//	    phoneNumber, and messageBody variables and print them.
//
//	    Sender: Mike Smith
//	    Phone Number: 202-123-3456
//	    Message body: I love programing and problem solving
	    
	    int message1= message.indexOf("<");
	    int message2= message.indexOf(">");
	    
	    sender= message.substring(message1+1,message2);
	    System.out.println("Sender: "+ sender);
	    
	    int number1= message.indexOf("[");
	    int number2= message.indexOf("]");
	    
	    phoneNumber=message.substring(number1+1,number2);
	    System.out.println("Phone Number: "+ phoneNumber);
	    
	    int messageBody1=message.indexOf("{");
	    int messageBody2=message.indexOf("}");
	    
	    messageBody=message.substring(messageBody1+1,messageBody2);
	    System.out.println("Message body: " +messageBody);
	    
	    
	}
}