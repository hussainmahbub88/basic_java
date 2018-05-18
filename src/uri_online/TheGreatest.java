package uri_online;

import java.util.Scanner;

public class TheGreatest {

	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s = sc.nextInt();
		
		int result = (a+b+a*b*s*(a-b))/2;
		System.out.println(result+ " eh o maior");

	}

}
