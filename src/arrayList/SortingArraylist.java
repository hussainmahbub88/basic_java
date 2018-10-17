package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArraylist {

	public static void main(String[] args) {
		// Sorting in ascending order
		ArrayList<String> list = new ArrayList<String>();
		list.add("India");
		list.add("Bangladesh");
		list.add("Australia");
		list.add("Pakistan");
		System.out.println("Before Sorting :" + list);
		Collections.sort(list);
		System.out.println("After Sorting :" + list);

		
		// Sorting in descending order
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("AA");
		list2.add("ZZ");
		list2.add("CC");
		list2.add("FF");
		System.out.println("Before Sorting :");
		for (String str : list2) {
			System.out.println(str);
		}
		Collections.sort(list2, Collections.reverseOrder());
		System.out.println("After Sorting :");
		for (String str : list2) {
			System.out.println(str);
		}

		
		// Sorting Interger in Ascending Order
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(11);
		arraylist.add(2);
		arraylist.add(7);
		arraylist.add(3);
		/* ArrayList before the sorting */
		System.out.println("Before Sorting:");
		for (int counter : arraylist) {
			System.out.println(counter);
		}
		/* Sorting of arraylist using Collections.sort */
		Collections.sort(arraylist);
		/* ArrayList after sorting */
		System.out.println("After Sorting:");
		for (int counter : arraylist) {
			System.out.println(counter);
		}
		
		
		// Sorting Integer in descending Order
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		arraylist2.add(11);
		arraylist2.add(2);
		arraylist2.add(7);
		arraylist2.add(3);
		/* ArrayList before the sorting */
		System.out.println("Before Sorting:");
		for (int counter1 : arraylist2) {
			System.out.println(counter1);
		}
		/* Sorting of arraylist using Collections.sort */
		Collections.sort(arraylist2, Collections.reverseOrder());
		/* ArrayList after sorting */
		System.out.println("After Sorting:");
		for (int counter1 : arraylist2) {
			System.out.println(counter1);
		}
	}

}
