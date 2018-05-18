package uri_online;

import java.util.Scanner;

public class AreaOfACircle {

	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		double R = input.nextDouble();
		double Area = 3.14159 * Math.pow(R,R);
		//double A= Math.round(Area * 10000.0)/10000.0;;
		System.out.println("A="+Area);
		
	}

}
