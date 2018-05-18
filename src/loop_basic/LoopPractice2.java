package loop_basic;

import java.util.Scanner;

public class LoopPractice2 {

	public static void main (String args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		System.out.println("Here is the pattern : ");
		for (int i = 1; i <= rows; i++) 
		{ 
			for (int j = rows; j >= i; j--)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
}
