package Arrays;

import java.util.Scanner;

public class TwoDLargestNumber {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    int max=Integer.MIN_VALUE;
	      for(int i=0;i<rows; i++){
	        for(int j=0; j<cols; j++){

	          if(max<arr[i][j]){

	          max=arr[i][j];
	          System.out.println(max);

	          }
	        }
	        
	      }
	}
}


