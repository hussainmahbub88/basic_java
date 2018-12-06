package problemsGivenByTushar;

import java.util.Scanner;

public class ProblemSeven {

	public static void main(String[] args) {
		System.out.println("Enter the value of c :");
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);

		boolean lorn = false;
		if (input >= 'a' && input <= 'z') {
			System.out.println("Lowercase");
			lorn = true;
			if (input == 'a')
				System.out.println("Vowel.");
			if (input == 'e')
				System.out.println("Vowel.");
			if (input == 'i')
				System.out.println("Vowel.");
			if (input == 'o')
				System.out.println("Vowel.");
			if (input == 'u')
				System.out.println("Vowel.");
		}

		if (input >= 'A' && input <= 'Z') {
			System.out.println("Uppercase");
			lorn = true;
			if (input == 'A')
				System.out.println("Vowel.");
			if (input == 'E')
				System.out.println("Vowel.");
			if (input == 'I')
				System.out.println("Vowel.");
			if (input == 'O')
				System.out.println("Vowel.");
			if (input == 'U')
				System.out.println("Vowel.");
		}

		if (input >= '0' && input <= '9') {
			lorn = true;
			System.out.println("Number");
		}

		if (lorn == false)
			System.out.println("It is a special character");

	}

}
