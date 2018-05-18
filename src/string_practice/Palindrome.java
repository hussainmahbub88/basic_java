package string_practice;
import java.util.Scanner;

public class Palindrome {

//	public static void main(String[] args) {
//
//		String reverse = "";
//
//		System.out.println("Enter the input string");
//		Scanner sc = new Scanner(System.in);
//		String original = sc.nextLine();
//		
//		for (int i= original.length()-1; i>= 0; i--) {
//			reverse = reverse + original.charAt(i);
//		}
//		if(original.equals(reverse)) {
//			System.out.println("Given Number is Palindrome");
//		}else
//			System.out.println("Given Number is not Palindrome");
//		
//		 
//	}
	
//	public static void Main()
//    {
//        System.out.println((IsPalindrome("ABCDEFG"))); // Prints false
//        System.out.println((IsPalindrome("ABCDCBA"))); // Prints true
//    }
//
//    public static boolean IsPalindrome(String text)
//    {
//        return isPalindrome(0, text.length() - 1, text);
//    }
//
//    private static boolean isPalindrome(int indexOfFirst, int indexOfLast, String text)
//    {
//        if (indexOfFirst >= indexOfLast)
//            return true;
//
//        if (text[indexOfFirst] != text[indexOfLast])
//            return false;
//
//        return isPalindrome(indexOfFirst + 1, indexOfLast - 1, text);
//    }
	public static void main(String[] args) {
		String str1 = "";
		String str2 = "1222";
		
		for (int i=str2.length()-1; i>=0; i--) {
			str1 = str1+str2.charAt(i);
		}
		if (str2.equals(str1)) {
			System.out.println("Given Number is Palindrome");
		}else
			System.out.println("Given Number is not Palindrome");
	}
}
