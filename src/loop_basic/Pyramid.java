package loop_basic;

import java.util.Scanner;

public class Pyramid {

	public static void main(String args[]) {

		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter the number of Pyramid : ");
		int number = user_input.nextInt();

		int spaceCounter = number, starCounter = number;
		for (int i = 1; i <= number; i++) {

			for (int j = 1; j <=spaceCounter ; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= starCounter; k++) {
				System.out.print("*");
			}
			spaceCounter = spaceCounter+1;
			starCounter = starCounter-2;
			System.out.println("");
		}

//		int spacecounter = number, starcounter = 1;
//		for (int i = 1; i <= number; i++) {	
//			for (int j = 1; j <= spacecounter; j++) {
//				System.out.print(" ");
//			}
//
//			for (int k = 1; k <= starcounter; k++) {
//				System.out.print("*");
//			}
//			spacecounter--;
//			starcounter = starcounter + 2;
//			System.out.println();
//		}
	}
}
