package array;

import java.io.Reader;
import java.util.Scanner;

public class Positive_Negative_Number_Count_In_Array {
	public static void main(String[] args) {
		
		int Size, i;
		int PositiveCount = 0, NegativeCount = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter element Size of array : ");
		Size = in.nextInt();
		
		int[] a = new int[Size];
				System.out.println("Please Enter " + Size + " elements of array");
		for(i=0;i<Size; i++) {
			a[i] = in.nextInt();
		}
		for(i=0;i<Size; i++) {
			if(a[i] >= 0) {
				PositiveCount++;
			}
			else if(a[i] < 0) {
				NegativeCount++;
			}
		}
		System.out.println("Total Positive Number in this Array: " + PositiveCount);
		System.out.println("Total Negative Number in this Array: " + NegativeCount);
	}
}
