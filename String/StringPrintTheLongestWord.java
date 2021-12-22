package String;

import java.util.Scanner;

public class StringPrintTheLongestWord {
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word1 = "bill";
	    String word2 = "check";
	    //WIRTE YOUR CODE HERE
	    if(word1.length()>word2.length()) {
	    	System.out.println(word1);
	    }else {
	    	System.out.println(word2);
	    }

}
}