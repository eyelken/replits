package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CopyCertainValues {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
	    System.out.println(Arrays.toString(getWithE(arr)));
	    
	  }
	  
	
	  
	  public static String[] getWithE(String[] arr) {
	    
	    //TODO : YOUR CODE GOES HERE ----------------------
		  	int counter=0;
		    int containsE=0;
		    
		    for(int i=0;i<arr.length;i++) {
		    	if(arr[i].contains("e")) {	
		    		counter++;
		    	}
		    }
		    	
		    String[] fewValues= new String[counter];
		    
		    for(int i=0; i<arr.length; i++) {
		    	if(arr[i].contains("e")) {
		    		fewValues[containsE]=arr[i];
		    		containsE++;
		    	}
		    }
	    
	    
	    //YOUR CODE ENDS HERE -----------------------
	    
	    return fewValues;
	     
	  }
	  
	}