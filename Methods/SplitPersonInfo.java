package Methods;

import java.util.Scanner;

public class SplitPersonInfo {
	  public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;
		  }
		  
		  public static void person(String info) {
				//your code here
			String[] last= info.split(",");
			String part1=last[0];
			String part2=last[1];
			String part3=last[2];
			
			System.out.println("person name: "+part1);
			System.out.println("last name: "+part2);
			System.out.println("age: "+part3);
		}
	
}
