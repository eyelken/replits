package Loops;

import java.util.Scanner;

public class PrintVowels {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    String word = "ahahaafdv";
	    //write your code below
	    char vowels;
	    
	    for(int i=0; i<word.length(); i++) {
	    	vowels=word.charAt(i);
	    	if(vowels=='a'||vowels=='e'||vowels=='i'||vowels=='o'||vowels=='u') {
	    		System.out.print(vowels);
	    	}
	    }
	    
	    

}
}
