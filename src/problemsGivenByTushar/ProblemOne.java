package problemsGivenByTushar;

import java.util.Scanner;

public class ProblemOne {

	public static void main(String[] args) {
		System.out.println("Enter the value of a :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("Enter the value of b :");
			Scanner s = new Scanner(System.in);
			int b = s.nextInt();

			if (b % 2 == 0) {
				System.out.println("B is even");
			} else {
				System.out.println("B is odd");
			}
		} else
			System.out.println("The value os a is Odd");

	}

}
