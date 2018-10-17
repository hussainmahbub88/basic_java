package loop_basic;

import java.util.Scanner;

public class ProblemsByRahin {

	public static void main(String[] args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 123456
		 * 1234567
		 

		for (int i=1 ;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		} */
		
		/*
		 * 0000000
		 * 000000
		 * 00000
		 * 0000
		 * 000
		 * 00
		 * 0
		 
		
		for (int i=7; i>=1;i--) {
			for (int j=i;j>=1;j--) {
				System.out.print(0);
			}
			System.out.println();
		} */
		
		/*
		 * 1111111
		 * 1111122
		 * 1111333
		 * 1114444
		 * 1155555
		 * 1666666
		 * 7777777
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the pattern number: ");
		int num = user_input.nextInt();
		for (int k=1 ;k<=num;k++) {
			for (int i=num-1; i>=k;i--) {
				System.out.print("1");
			}
			for(int l=1;l<=k;l++) {
				System.out.print(k);
			}
			System.out.println();
		}  */
		
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
		 
		
		Scanner user_input = new Scanner (System.in);
		System.out.println("Enter the Number: ");
		int num = user_input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		for (int k = num-1; k >= 1; k--) {
			for (int l = 1; l <= k; l++) {
				System.out.print(l);
			}
			System.out.println("");
		} */
	}

}
