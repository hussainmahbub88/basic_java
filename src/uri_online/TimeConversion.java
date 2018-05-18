package uri_online;

import java.util.Scanner;

public class TimeConversion {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = sc.nextInt();
		
		int hour = input/3600;
		input = input-(hour*3600);
		
		int min = input/60;
		input = input-(min*60);
		
		System.out.printf("%d:%d:%d\n", hour, min, input);
	}

}
