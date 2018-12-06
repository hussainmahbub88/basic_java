package uri_online;

import java.util.Scanner;

public class TheGreatest {

	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int ab = (a + b + Math.abs(a - b)) / 2;
		int max = (ab + c + Math.abs(ab - c)) / 2;
		System.out.println(max + " eh o maior");

	}

}
