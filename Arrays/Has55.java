package Arrays;

import java.util.Scanner;

public class Has55 {
	
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] nums = {1, 5, 4, 1, 5};
		    
		    //TODO Type your code below:
		    for(int i=0; i<nums.length-1; i++) {
		    	if(nums[i]==5 && nums[i+1]==5) {
		    		System.out.println("true");	
		    		break;		    		    		
		    	}
		    }
		    System.out.println("false");
		    
	}

}
