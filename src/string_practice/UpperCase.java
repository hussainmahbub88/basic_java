package string_practice;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "sbscsd";
		System.out.println(a.toUpperCase());
		//System.out.println(a.replace("s", "A"));
		String change = a.replace("s", "A");
		System.out.println(change);
		String name = a.replaceAll("sbscsd", "MaMuM");
		System.out.println(name);
		String name2 = name.replace("M", "m");
		System.out.println(name2);
		
	}

}
