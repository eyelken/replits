package Arrays;

import java.util.Scanner;

public class SplitSentence {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence = "Java is fun";
	    
	    //type your code below
	    String [] str= sentence.split(" ");
	    for(String word : str) {
	    	System.out.println(word);
	    	
	    }
	    
    
	  }
}
