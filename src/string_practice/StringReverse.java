package string_practice;

public class StringReverse {

	public static void main(String[] args) {

		String word = "Mamun";
		System.out.println(reverseString(word));
	}

	public static String reverseString(String word) {

		StringBuilder str = new StringBuilder();
		str.append(word);
		str.reverse();
		word = new String(str);
		return word;
	}

}
