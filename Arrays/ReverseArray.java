package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] nums = {4, 3, 2, 44, 1, 100, 55};
	    
	    
	    //TODO: write your code below
	   
        	int [] reverse = new int[nums.length];
        	for(int i=nums.length-1,j=0; i>=0; i--,j++) {
            reverse[j]= nums[i];
        }
        System.out.println(Arrays.toString(reverse));

    }
	   
}
