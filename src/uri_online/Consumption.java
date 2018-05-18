package uri_online;

import java.util.Scanner;

public class Consumption {

	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int X = sc.nextInt();
		float Y = sc.nextFloat();
		
		float result = X/Y;
		System.out.printf("%.3f km/l\n", result);
		
	}

}
