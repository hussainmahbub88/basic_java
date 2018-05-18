package uri_online;

import java.util.Scanner;

public class Area {
	
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the value of A,B and C");
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		
		float areaOfTriangle = (A*C)/2;
		String total = String.format("TRIANGULO: %,.3f", areaOfTriangle);
		System.out.println(total);
		double areaOfCircle = 3.14159*Math.pow(C, 2);
		String total1 = String.format("CIRCULO: %,.3f", areaOfCircle);
		System.out.println(total1);
		float areaOfTrapezium = (A+B)/2*C;
		String total2 = String.format("TRAPEZIO: %,.3f", areaOfTrapezium);
		System.out.println(total2);
		float areaOfSquare = B*B;
		String total3 = String.format("TRAPEZIO: %,.3f", areaOfSquare);
		System.out.println(total3);
		float areaOfRectangle = A*B;
		String total4 = String.format("TRAPEZIO: %,.3f", areaOfRectangle);
		System.out.println(total4);
		
		
//		System.out.println("TRIANGULO: "+areaOfTriangle);
//		System.out.println("CIRCULO: "+areaOfCircle);
//		System.out.println("TRAPEZIO: "+areaOfTrapezium);
//		System.out.println("QUADRADO: "+areaOfSquare);
//		System.out.println("RETANGULO: "+areaOfRectangle);
	}

}
