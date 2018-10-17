package string_practice;

public class CountEvenAndOddNum {
	public static void main(String[] args) {

		int num = 0;
		int countEven = 0;
		int countOdd = 0;
		num = num % 10;
		if (num / 2 == 0) {
			countEven++;
		} else {
			countOdd++;
		}
		System.out.print(countEven + " " + countOdd);

	}
}
