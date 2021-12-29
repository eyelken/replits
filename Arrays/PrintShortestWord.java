package Arrays;

import java.util.Scanner;

public class PrintShortestWord {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String[] str = {"java, cable, red, vivid, remedy, grace"};
	    	    
	    int shortestWord=0;
	    for(int i=0; i<str.length; i++) {
    	if(str[i].length()<str[shortestWord].length()) {
	    		shortestWord=i;
	    	}
	    }
	    System.out.println(str[shortestWord]);
}
}