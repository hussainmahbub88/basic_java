package problemsGivenByTushar;

import java.util.Scanner;

public class ProblemFour {

	public static void main(String[] args) {
		System.out.println("Enter the value of a :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if ((a >= 50 && a <= 70) && a % 2 != 0 ) {
			System.out.println("You are Right");
		}else 
			System.out.println("Wrong");
		
	}

}
