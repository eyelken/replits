package Methods;

import java.util.Scanner;

public class MethodsWithReturnProfitOrLoss {
	public static String profits(int buyPrice,int sellPrice){
	    //your code here
	   
	   if(buyPrice<sellPrice) {
		   return "profit";
	   }else if(buyPrice>sellPrice) {
		   return "loss";
	   }else {
		   return "no loss";
	   }  
	   }

	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		  System.out.println(profits(in.nextInt(), in.nextInt()));
	  }
	  

}
