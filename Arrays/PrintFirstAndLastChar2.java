package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLastChar2 {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    String[] words = {"hello", "why", "by", "apple" , "note"};
	    
	    String[] last=new String[words.length];
	    for(int i=0; i<words.length; i++) {
	    	
	    	last[i]= words[i].substring(0,1)+words[i].substring(words[i].length()-1);
	    }
	    
	    System.out.println(Arrays.toString(last));

}
}