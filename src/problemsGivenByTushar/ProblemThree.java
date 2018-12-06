package problemsGivenByTushar;

import java.util.Scanner;

public class ProblemThree {

	public static void main(String[] args) {
		System.out.println("Enter the value of a :");
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			System.out.println("It is Vowel");
		}else 
			System.out.println("It is not Vowel");

	}

}
