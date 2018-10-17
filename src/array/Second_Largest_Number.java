package array;

import javax.print.StreamPrintService;

public class Second_Largest_Number {
	public static void main (String [] args) {
		int number[] = new int[] {1,3,4,6,3,5,3,2,5,6};
		int temp;
		
		for(int i = 0; i<number.length; i++) {
			
			for(int j = i+1; j < number.length;j++) {
				
				if(number[i] < number[j]) {
					
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println(number[1]);
	}
}
