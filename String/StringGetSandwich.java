package String;

import java.util.Scanner;

public class StringGetSandwich {
	
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     String str = "breadbutterbread";
	     
	     	int firstIndex = 0;
			int lastIndex = 0;

			firstIndex = str.indexOf("bread");
			firstIndex = firstIndex + "bread".length();
			
			lastIndex = str.lastIndexOf("bread");

			// there should be at least two breads
			if (firstIndex != -1 && lastIndex != -1 && str.length() > 10) {
				System.out.println(str.substring(firstIndex, lastIndex));
			} else {
				System.out.println("nothing");
			}

}
}