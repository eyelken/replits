package Methods;

import java.util.Scanner;

public class MethodsWithReturn3Locks {
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
	    
		boolean flag=true;
	    if(a==flag && b==flag) {
				return true;
			}else if(c==flag) {
				return true;
			}
		return flag;
	    
	    
	  }//end threeLocks

	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
			System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));
	  }

}
