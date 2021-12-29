package Loops;

import java.util.Scanner;

public class CountJava {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    
	    int countJava=0;
	    int lastIndex=0;
	    
	    while(lastIndex!=-1) {
	    	lastIndex=word.indexOf("java",lastIndex);
	    	if(lastIndex!=-1) {
	    		countJava++;
	    		lastIndex += "java".length();
	    	}
	    }
	    System.out.println(countJava);
	    
	}

}