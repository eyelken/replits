package Loops;

import java.util.Scanner;

public class EqualsJavaPhyton {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String sentence = "What's the difference between java, javascript and python?";
	    
	    int countJava=0;
	    int countPyhton=0;
	    int lastIndex=0;
	    
	    while(lastIndex!=-1) {
	    	lastIndex=sentence.indexOf("java",lastIndex);
	    	if(lastIndex!=-1) {
	    		countJava++;
	    		lastIndex+="java".length();
	    	}
	    }
	    while(lastIndex!=-1) {
	    	lastIndex=sentence.indexOf("phyton",lastIndex);
	    	if(lastIndex!=-1) {
	    		countPyhton++;
	    		lastIndex+="phyton".length();
	    	}
	    }
	    
	    if(countJava==countPyhton) {
	    	System.out.println("true");
	    }else {
	    	System.out.println("false");
	    }

}
}