package String;

import java.util.Scanner;

public class StringMergeThem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word1 = "aok";
	    String word2 = "lol";
	    //YOUR CODE HERE
	    
	 
	    String text="";
	    if(word1.length()!=3 || word2.length()!=3){
	        System.out.println("cannot merge");
	    }else{
	      for(int i=0;i<3;i++){
	        text+=word1.charAt(i)+""+word2.charAt(i);
	      }
	      System.out.println(text);
	    }
	    
//	    if(word1.length()!=3 || word2.length()!=3){
//	        System.out.println("cannot merge");
//	    }else{
//	      System.out.println(word1.charAt(0)+ "" +word2.charAt(0)+word1.charAt(1)+ "" +word2.charAt(1)+word1.charAt(2)+ "" +word2.charAt(2));
//	    }  
	    
	    
	  
	}

	}
