package Loops;

import java.util.Scanner;

public class CountHi {
	
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String str = "hihelloegehihihihellohi";
		    
		    int counterHi=0;
		    int lastIndex=0;
		    
		    while(lastIndex!=-1) {
		    	lastIndex=str.indexOf("hi",lastIndex);
		    	if(lastIndex!=-1) {
		    		counterHi++;
		    		lastIndex+="hi".length();
		    	}
		    }
		    System.out.println(counterHi);
	 }
		    		
		    
		    

}
