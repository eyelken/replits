package Arrays;

import java.util.Scanner;

public class Printing01 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		
    for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j].substring(0, 3));
		
		
		
    }
	}
}


