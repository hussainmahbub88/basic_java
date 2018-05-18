package loop_basic;

//import java.lang.*;
//import java.io.*;
//import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		
//		String input = "Mahbub Hussain Mamun";
//		
//		StringBuilder input1 = new StringBuilder();
//		// append a string into StringBuilder input1
//        input1.append(input);
//        
//        // reverse StringBuilder input1
//        input1 = input1.reverse();
//        
//        // print reversed String
//        for (int i=0; i<input1.length(); i++) {
//            System.out.print(input1.charAt(i));
//        }
		
		String word = "Mamun Hussain ";
		
		StringBuilder input = new StringBuilder();
		input.append(word);
		input = input.reverse();
		
		for (int i=1; i<input.length();i++) {
			System.out.print(input.charAt(i));
		}
	}

}
