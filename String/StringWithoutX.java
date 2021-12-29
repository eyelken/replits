package String;

import java.util.Scanner;

public class StringWithoutX {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = "xHiX";
	    
//	    if(word.contains("x") || word.contains("X"));
//	    int x1=word.indexOf("x");
//	    int x2=word.indexOf("X");
//	    
//	    String wordWithoutX=word.substring(x1+1,x2);
//	    System.out.println(wordWithoutX);
//
//}
//}

		if (word.startsWith("x") || word.startsWith("X")) {
			System.out.println(word.substring(1, word.length()));
		} else if (word.endsWith("x") || word.endsWith("X")) {
			System.out.println(word.substring(0, word.length() - 1));
		}
		System.out.println(word);
		
		}
		
		}