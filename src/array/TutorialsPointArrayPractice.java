package array;

public class TutorialsPointArrayPractice {

	public static void main(String[] args) {
		double[] myList = { 1.9, 2.9, 3.5, 4.5 };

		// print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
		}

		// Summing all elements
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total = total + myList[i];
		}
		System.out.println("Total is : " + total);

		// Finding the largest element
		double max = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] > max) {
				max = myList[i];
			}
		}
		System.out.println("The Maximun value is : " + max);

		// Finding the smallest element
		double min = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] < min) {
				min = myList[i];
			}
		}
		System.out.println("The Minimum value is : " + min);
	}

}
