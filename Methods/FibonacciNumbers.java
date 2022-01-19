package Methods;

import java.util.Scanner;

public class FibonacciNumbers {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	  }
	  
	  public static void fib(int num){
	    //WRITE YOUR CODE HERE
		  	int sum=0;
		  	for(int i=0, j=0, k=0; i<=num-2; i++) {
		  		sum=j+k;
		  		j =k;
	            k = sum;
	        }
	        System.out.println(sum);

	    
	  }

}
