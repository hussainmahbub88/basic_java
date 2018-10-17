package string_practice;

public class RemoveGivenCharFromString {

	public static void main(String[] args) {

		// 1.Write a method which will remove any given character from a string
		// 2.Print the length of the String without using inbuild function

		/*
		 * String str = "this is Java";
		 * System.out.println("After removing the character from the String is: " +
		 * removeCharAt(str, 3)); System.out.println("Length of the String is: " +
		 * lengthOfString(str)); }
		 * 
		 * public static String removeCharAt(String s, int pos) { return s.substring(0,
		 * pos) + s.substring(pos + 1); }
		 * 
		 * public static int lengthOfString(String str) { int length = 0; for (char c :
		 * str.toCharArray()) { length++; } return length; }
		 */

		// public static int getLengthOfString(String str) {
		// int length = 0;
		// char[] charArray = str.toCharArray();
		// for (int i = 0; i < charArray.length; i++) {
		// char c = charArray[i];
		// length++;
		// }
		// return length;

		/*
		 * System.out.println(removeCharInString("My name is mamun", 'a'));
		 * 
		 * }
		 * 
		 * public static String removeCharInString(String string, char charToBeRemoved)
		 * {
		 * 
		 * if (string == null) return "";
		 * 
		 * StringBuilder strBuild = new StringBuilder();
		 * 
		 * for (int i = 0; i < string.length(); i++) { char chr = string.charAt(i); if
		 * (chr == charToBeRemoved) continue; strBuild.append(chr); } return
		 * strBuild.toString();
		 */

		String str = "Welcome to office";
		System.out.println(str);

		str = removeChar(str, 'o');
		System.out.println(str);
	}

	public static String removeChar(String s, char c) {
		if (s == null) {
			return null;
		}
		return s.replaceAll(Character.toString(c), "");
	}

}
