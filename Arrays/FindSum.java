package Arrays;

import java.util.Scanner;

public class FindSum {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] nums = {2, 1, 2, 3, 4};
	    
	    //TODO: write your code below
	    int sum=0;
	    for(int i=0; i<nums.length; i++) {
	    	if(nums[i]>0) {
	    		sum+=nums[i];
	    	}
	    }
	    System.out.println(sum);
	    
	    
	}
}
