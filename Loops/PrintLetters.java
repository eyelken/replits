package Loops;

import java.util.Scanner;

public class PrintLetters {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	    
	    char c;
	    
	    for(c=start; c<=end; ++c) {
	    	System.out.print(c);
	    }

}
}