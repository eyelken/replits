package Arrays;

import java.util.Scanner;

public class FindingMaxLength {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String[] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		
		//write your code below
		int maxLength=0;
		
		for(int i=0; i<5; i++) {
			if(words[i].length() > words[maxLength].length()) {
				maxLength=i;
			}
		}
		
			System.out.println(words[maxLength]);
	
}
}