package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringEmail1 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String email = "mike_tyson@gmail.com"; //we want to print this as tyson_mike@gmail.com
	    
	    	if(email.contains("_")) {
	    	email= email.replaceAll("@", " ");
		    email=email.replace("_", " ");
		    String[] str= email.split(" ");
		    String part1= str[0];
		    String part2= str[1];
		    String part3= str[2];
		    System.out.println(part2+"_"+part1+"@"+part3);
	    	
	    }else {
	    	System.out.println(email);
	    }
	}
}