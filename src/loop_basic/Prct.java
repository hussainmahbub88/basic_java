package loop_basic;

public class Prct {

	public static void main(String[] args) {
		/*
		 *      1 
		 *     2 3 
		 *    3 4 5 
		 *   4 5 6 7 
		 */
		
		for (int i=1; i<=4; i++) {
			for (int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			for (int m=1; m<=i; m++) {
				int n = i+m-1;
				System.out.print(n + " ");
				
			}
			System.out.println("");
		}
		
	}

}
