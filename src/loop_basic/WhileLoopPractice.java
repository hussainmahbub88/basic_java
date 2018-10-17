package loop_basic;

public class WhileLoopPractice {

	public static void main(String[] args) {

		int x = 10;
		// while (x < 20) {
		// System.out.println("Value of x : " + x);
		// x++;
		// }

		while (true) {
			System.out.println("Value of x : " + x);
			x++;
			if (x == 20)
				break;
		}

	}

}
