package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Printing02 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] arr = new String[8];

	    	arr[0]= input.nextLine();
			arr[1]= input.nextLine();
			arr[2]= input.nextLine();
			arr[3]= input.nextLine();
			arr[4]= input.nextLine();
			arr[5]= input.nextLine();
			arr[6]= input.nextLine();
			arr[7]= input.nextLine();
	  
	    for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]+ ", "+arr[i+1]);
				i++;
			
	      
			
	    
					
			}			
			}
					
}
		
	

