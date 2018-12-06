package problemsGivenByTushar;

import java.util.Scanner;

public class ProblemSix {

	public static void main(String[] args) {
		System.out.println("Enter the value of c :");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		if (c >= 'a' && c<= 'z') {
			System.out.println("Lowercase");
		}else if (c >= 'A' && c<= 'Z') {
			System.out.println("Uppercase");
		}else if (c >= '0' && c<= '9') {
			System.out.println("Numeric");
		}else 
			System.out.println("Not Working");

	}

}
