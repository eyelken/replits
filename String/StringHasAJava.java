package String;

import java.util.Scanner;

public class StringHasAJava {
	public static void main(String[] args) {
	    boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = "c#javaruby";
	    
	   for(int i=0; i<2; i++) {
		   if(word.charAt(i)=='j' || word.charAt(i+1)=='a') {
			   System.out.println(true);
		   }else {
			   System.out.println(false);
		   }
	   }
	    
	  }
	}


