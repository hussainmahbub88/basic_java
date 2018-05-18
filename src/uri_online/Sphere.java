package uri_online;

import java.util.Scanner;

public class Sphere {

	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = sc.nextDouble();
		
		double volume = (4/3.0 * 3.14159 * (Math.pow(radius, 3)));
		//System.out.println("VOLUME = "+volume);
		String total = String.format("VOLUME =  %,.3f", volume);
		System.out.println(total);

	}

}
