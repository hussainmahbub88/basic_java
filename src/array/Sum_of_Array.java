package array;

public class Sum_of_Array {

	public static void main(String[] args) {
		int number[] = new int[] {1,3,4,6,3,5,3,2,5,6};
		int sum = 0;
		
		for(int i = 0; i< number.length; i++) {
			sum = sum+i;
		}
		System.out.println("Sum of Array : " + sum);
	}
}
