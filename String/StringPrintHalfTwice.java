package String;

import java.util.Scanner;

public class StringPrintHalfTwice {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = "java";
		    //WRITE YOUR CODE HERE
		    System.out.println(word.substring(0,word.length()/2)+ word.substring(0,word.length()/2));
		    }

}