package Methods;

import java.util.Scanner;

public class MethodsWithReturnSimpleRoomBooking {
	 public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
		   // your code here 
		 if(isAvailable==true && year==2018 && !((month==7) && ((day>=1)&&(day<=8))))
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }

		  public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
				System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
		    
		  }

}
