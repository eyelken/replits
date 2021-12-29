package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPieces {
	
	public static void main(String[] args) {
		
//		Given an int array num of any length, 
//		print a new array of its first 2 elements. 
//		If the array is smaller than length 2, use whatever elements are present.
		
		   		Scanner scan = new Scanner(System.in);
				int size = scan.nextInt();
				int[] num = new int[size];
				for(int i =0; i < size; i++) {
					num[i] = scan.nextInt();
				}
				//WRITE YOUR CODE HERE
				
				if(size<2 && size>0) {
					System.out.println(Arrays.toString(num));
				}else {
					int[] firstTwo= new int[2];
					for(int i=0; i<2; i++) {
						firstTwo[i]=num[i];
					}
					System.out.println(Arrays.toString(firstTwo));
				}
				
				
				}
				
		  }
		


