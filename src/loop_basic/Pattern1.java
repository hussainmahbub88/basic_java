package loop_basic;

public class Pattern1 {

	public static void main(String[] args) {
		/* 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		} */
		
		
		/* 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}  */
		
		
		/* 54321
		 * 4321
		 * 321
		 * 21
		 * 1
		 
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.print("\n");
		}  */
		
		/* 5
		 * 54
		 * 543
		 * 5432
		 * 54321
		 
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.print("\n");
		}  */

	}

}
