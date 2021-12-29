package Loops;

public class PrintLettersCombination {
	public static void main(String[] args) {
		for(char outerChar='z'; outerChar>='v';outerChar--) {
			for(char innerChar='z'; innerChar>='v'; innerChar--) {
				System.out.print(outerChar);
				System.out.print(innerChar);
				System.out.println();
			}
		}
	}

}
//		for (char i = 'z'; i >= 'v'; i--) {
//			for (char j = 'z'; j >= 'v'; j--) {
//				System.out.print(i);
//				System.out.print(j);
//				System.out.println();
//			}
//		}
//
//	}
//
//}
