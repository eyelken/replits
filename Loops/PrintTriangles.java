package Loops;

import java.util.Scanner;

public class PrintTriangles {
	
	public static void main(String[] args) {
	    	int i = 1;
			int j = 1;
			Scanner scan = new Scanner(System.in);
			int n = 5;
			
			for(int i1=1; i1<=n; i1++) {
				for(j=1; j<=i1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

}
}