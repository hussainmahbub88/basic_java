package loop_basic;

import java.util.Scanner;

public class NewLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.println("Here is the pattern : ");
		for (int i = rows; i >= 1; i--) {
			for (int j= rows; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
