package array;

public class Largest_Smallest_Number {

	public static void main(String[] args) {
		
		int number [] = new int[] {1,3,4,6,3,5,3,2,5,6};
		
		int smallest = number[0];
		int largest = number[0];
		
		for(int i = 1; i < number.length; i++) {
			
			if(number [i] > largest)
				smallest = number[0];
			
			else if(number [i] < smallest)
				largest = number[0];
		}
		
		System.out.println("Largest number is : " + largest);
		System.out.println("Smallest number is : " + smallest);
		
	}

}
