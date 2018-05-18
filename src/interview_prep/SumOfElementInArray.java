package interview_prep;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfElementInArray {

	public static void main(String[] args) {
		// int a [] = {10,20,30,40,50};
		// int sum = IntStream.of(a).sum();
		// System.out.println("The sum is " + sum);

		// int[] numbers = {1,2,3,4};
		// int sum = 0;
		// for( int i : numbers) {
		// sum += i;
		// }
		//
		// System.out.println(sum);

		// Find the the Even Or Odd Number
		System.out.println("Please Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i % 2 == 0) {
			System.out.println("Even Number");
		} else
			System.out.println("Odd Number");
	}

}
