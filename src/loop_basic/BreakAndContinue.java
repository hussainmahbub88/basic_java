package loop_basic;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int x : numbers) {
			// if (x == 30) {
			// break;
			// }
			if (x == 30) {
				continue;
			}
			System.out.println("Value of x is : " + x);
	}
		

	}

}
