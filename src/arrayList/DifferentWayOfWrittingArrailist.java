package arrayList;

import java.util.ArrayList;

public class DifferentWayOfWrittingArrailist {


	    public static void main(String[] args)
	    {
	        ArrayList<Integer> list1 = new ArrayList<Integer>();            //First Method
	        ArrayList<String> list2 = new ArrayList<String>(20);         //Second Method
	        ArrayList<Integer> list3 = new ArrayList<Integer>(list1);      //Third Method
	    }
	
	    // http://javaconceptoftheday.com/java-arraylist-programming-examples/
}
