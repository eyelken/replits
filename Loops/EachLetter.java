package Loops;

import java.util.Scanner;

public class EachLetter {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    String word = "hello";
	    //write your code below
	    for(int i=0; i<word.length(); i++) {
	    	System.out.println(word.charAt(i));
	    }

}
}