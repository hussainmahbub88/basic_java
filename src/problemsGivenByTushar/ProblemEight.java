package problemsGivenByTushar;

import java.util.Scanner;

public class ProblemEight {

	public static void main(String[] args) {
		System.out.println("Enter the value :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = str.charAt(0);
		int a = Integer.parseInt(str);
		
		if (c >= 'a' && c <= 'z') {
			System.out.println("Lowercase");
		}else if (c >= 'A' && c <= 'Z') {
			System.out.println("Uppercase");
		}else if (a>= Integer.MIN_VALUE && a<= Integer.MAX_VALUE) {
			System.out.println("Numeric");
		}else 
			System.out.println("Not Working");


		

	}

}
