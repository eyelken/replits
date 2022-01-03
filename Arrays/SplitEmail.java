package Arrays;

import java.util.Scanner;

public class SplitEmail {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String email = "info@cybertekschool.com";
	    
	    //Write your code below
	    String[] arrStr = email.split("@");
		if(!email.contains("@") || arrStr.length>2){
			System.out.println("invalid email");
			return;
		}
		System.out.println("Email id: " + arrStr[0]);
		System.out.println("Email domain: " + arrStr[1]);
			
	    }
	}


