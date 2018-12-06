package problemsGivenByTushar;

import java.util.Scanner;

public class ProblemTwo {

	public static void main(String[] args) {
		System.out.println("Enter the value of a :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a > 10 && a < 20) {
			System.out.println("a is between 10-20");
		}else
			System.out.println("Out of range");

	}

}
