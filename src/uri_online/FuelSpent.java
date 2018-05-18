package uri_online;

import java.util.Scanner;

public class FuelSpent {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int spentTime = sc.nextInt();
		int averageSpeed =sc.nextInt();
		
		float liters = spentTime * averageSpeed / 12;
		String total = String.format("%,.3f", liters);
		System.out.println(total);
		//System.out.println(liters);
	}

}
