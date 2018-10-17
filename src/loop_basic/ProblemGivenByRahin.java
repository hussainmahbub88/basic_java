package loop_basic;

public class ProblemGivenByRahin {

	public static void main(String[] args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 123456
		 * 1234567
		 * 

		for (int i=1; i<=7; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		} */ 
///////////////////////////////////////////////////////////////////////////////////////////////
		
		/*
		 *       1 2 3 4 5 6 7 
         *         1 2 3 4 5 6 
         *          1 2 3 4 5 
         *           1 2 3 4 
         *            1 2 3 
         *             1 2 
         *              1 
		 *  	     
		 * 

		int row = 7, space = 7, digit = 7;
		
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=digit; k++) {
				System.out.print(k+" ");
			}
			
			space++;
			digit = digit-1;
			System.out.println("");
		} */
//////////////////////////////////////////////////////////////////////////////////////////////////		
		
		/*      1 2 3 4 5 6  7
		 * 	      2 3 4 5 6 7	 
		 *         3 4 5 6 7
		 *          4 5 6 7
		 *           5 6 7
		 *            6 7
		 *             7
		 * */
		int row = 7, space = row, digit = 7;
		
		for (int i=1; i<=row; i++) {
			for (int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=digit; k++) {
				System.out.print("* ");
			}
			
			space++;
			digit = digit-1;
			System.out.println("");
		}
		
	}

}
