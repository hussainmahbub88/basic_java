package interview_prep;

public class SwappingTwoNumbers {

	public void swap(String a,String b) {
		System.out.println("Strings before swap: a = " + a + " and b = " + b);
		a = a.concat(b);
		//System.out.println(a);
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("Strings after swap: a = " + a + " and b = " + b);
	}
	
	public static void main(String[] args) {
		// Swapping Two Integers
	/*	int x = 10;
		int y = 20;
		System.out.println("Before swap:");
		System.out.println("Value of x is: "+x);
		System.out.println("Value of y is: "+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swap:");
		System.out.println("Value of x is: "+x);
		System.out.println("Value of y is: "+y); */
		
		// Swapping Two String
		SwappingTwoNumbers sw = new SwappingTwoNumbers();
		sw.swap("abc", "cdef");
		
		
//		x = x.concat(y);
//		y = x.substring(0, 2);
//		x = x.substring(2, 5);
//		System.out.println("After swap:");
//		System.out.println("Value of x is: "+x);
//		System.out.println("Value of y is: "+y);
		
//		int a,b;
//		a = Integer.parseInt(x);
//		b = Integer.parseInt(y);
//		System.out.println("Before swap:");
//		System.out.println("Value of x is: "+x);
//		System.out.println("Value of y is: "+y);
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		System.out.println("After swap:");
//		System.out.println("Value of x is: "+x);
//		System.out.println("Value of y is: "+y);
	}

}
