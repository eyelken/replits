package String;

import java.util.Scanner;

public class StringReverseIt {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = "Apple";
	    //WRITE YOUR CODE HERE
	    String reverse= "";

	    if(word.length()<5){
	      System.out.println("Too short!");
	    }else if(word.length()>5){
	      System.out.println("Too long!");
	    }else{
	      for(int i=0; i<word.length();i++){
	        char ch= word.charAt(i);
	        reverse= ch+reverse;
	        
	      }
	      System.out.println(reverse);
	    }
	  }
	}


