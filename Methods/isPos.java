package Methods;

import java.util.Scanner;

import day31_ArrayList.arrayListExample;

public class isPos {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = 5;
	    
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++){
	    arr[i]=inp.nextInt();
	    }
	    //#2 Your code here
	    
	    for(int i = 0; i < arr.length; i++){
	           isPos(arr[i]);
	    }
	  
	  }
	  
	  public static void isPos(int num){
	    //#1 your code here
	    //If the int num is positive print positive, negative, or zero
		  	
		  	
			  	if(num<0) {
					System.out.println("negative");	
					
				}else if (num>0) {
					System.out.println("positive");
				
				}else {
					System.out.println("zero");				
				}
		  }
	   
	  }


