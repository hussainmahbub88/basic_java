package array;

public class Find_duplicat_Number {

	public static void main(String[] args) {
		int number[] = new int[] {5,3,2,5,2};
		
		for(int i=0;i<number.length;i++) {
			
			for(int j=i+1;j<number.length;j++) {
			 
				if(number[i] == number[j]) {
					System.out.println("Duplicates Number : " + number[i] + " Yes");
				}
				else if(number[i] != number[j]) {
					System.out.println("Duplicates Number : " + number[i] + " No");
				}
			}
		}
	}
}
