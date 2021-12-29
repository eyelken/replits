package Loops;

public class Print80to20Evens {
	public static void main(String[] args) {
		for(int i = 80; i >= 20; i -= 1) {
			if(i%2==0)
			System.out.print(i+" ");
			
		}
		System.out.println();
		
	}

}