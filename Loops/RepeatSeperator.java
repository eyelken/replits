package Loops;

import java.util.Scanner;

public class RepeatSeperator {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = "This";
	    String separator = "X";
	    int count = 3;
	    
	    for(int i=0;i<count;i++)
        {
            if(i!=count-1)
            {
                System.out.print(word.concat(separator));
            }
            else
            {
                System.out.print(word);
	    }
}
	}
}