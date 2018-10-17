package string_practice;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	String s = new String ("How are you ?");
		String ss = s.substring(4,7);
		System.out.println(s);
		System.out.println(ss);
		System.out.println(s.substring(4,7));  */
		
		
	/*	String s = new String ("You are a nice boy");
		
		String first3 = s.substring(0, 3);
		System.out.println(first3);
		
		String last3 = s.substring(s.length()-3);
		System.out.println(last3);
		
		String ss = first3 + last3;
		System.out.println(ss);  */
		
		String s = "I am Joy.I am Joy.Joy is a good boy";
		s.charAt(4);
		System.out.println(s.indexOf("Joy"));
		System.out.println( s.lastIndexOf("Joy"));
		//s=s.replaceFirst("Joy", "Ma");
		System.out.println(s.replaceAll("Joy", "Tushar"));
		System.out.println(s);
		s = s.replaceAll("Joy", "Mamun");
		System.out.println(s);
		s = s.replaceAll("Mamun", "Yooo");
		
		System.out.println(s);
		
		
	}

}
