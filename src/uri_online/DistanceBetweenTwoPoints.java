package uri_online;

import java.util.Scanner;
import java.lang.*;

public class DistanceBetweenTwoPoints {

	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of X1 and Y1");
		double x1 = sc.nextDouble();
		double y1 =sc.nextDouble();
		
		System.out.println("Enter the value of X2 and Y2");
		double x2 =sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double a = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
		
		double distance = Math.sqrt(a) ;
		System.out.printf("%.4f",distance);
		
		

	}

}
