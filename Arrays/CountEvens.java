package Arrays;

import java.util.Scanner;

public class CountEvens {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    int[] nums = {2,1,2,3,4};
	    
	    //TODO: Write your code below
	    //nums → [2, 1, 2, 3, 4]) → 3
	    
	    int countEven=0;
	        
	    for(int i=0; i<nums.length; i++) {
	    	if(nums[i]%2==0) {
	    		countEven++;
	    	}
	    }
	    System.out.println(countEven);
	    
	    
	  }
	}



