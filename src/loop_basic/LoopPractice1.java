package loop_basic;

public class LoopPractice1 {

	public static void main(String[] args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		} 

		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 1234
		 * 123
		 * 12
		 * 1
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		for (int k = 4; k >= 1; k--) {
			for (int l = 1; l <= k; l++) {
				System.out.print(l);

			}
			System.out.println("");
		} 
	}

}
