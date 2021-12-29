package Arrays;

import java.util.Scanner;

public class TwoDDiagonal {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int[][] matrix = new int[][] {
            {11, 2, 4},
            {4 , 9, 6},
            {10, 8, 12}
        };
        
        int result=0;
        
        int d1 = 0, d2 = 0;
        
        for (int i = 0; i < result; i++)
        {
            d1 += matrix[i][i];
            d2 += matrix[i][result-i-1];
        }
      
        // Absolute difference of the sums
        // across the diagonals
        System.out.println(Math.abs(d1-d2));
    }
	    
	    
	    
	    // FINAL PRINT
	  
	  
}


