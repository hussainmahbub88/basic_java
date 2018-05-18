package uri_online;

import java.util.Scanner;

public class SimpleCalculate {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the product One Information");
		int productCodeOfProductone = sc.nextInt();
		int numOFUnitOfProductone = sc.nextInt();
		float priceOfProductone = sc.nextFloat();
		
		System.out.print("Enter the product Two Information");
		int productCodeOfProducttwo = sc.nextInt();
		int numOFUnitOfProducttwo = sc.nextInt();
		float priceOfProducttwo = sc.nextFloat();
		
		float productOne = numOFUnitOfProductone * priceOfProductone;
		float productTwo = numOFUnitOfProducttwo * priceOfProducttwo;
		
		float result = productOne + productTwo;
		String total = String.format("VALOR A PAGAR: R$  %,.2f", result);
		System.out.println(total);

		
	}

}
