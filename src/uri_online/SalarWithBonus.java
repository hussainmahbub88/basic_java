package uri_online;

import java.util.Scanner;

public class SalarWithBonus {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter the Fixed Salary :");
		double fxsalary = sc.nextDouble();
		
		System.out.println("Enter the Total Sale of the month :");
		double totalSale = sc.nextDouble();
		
		double result = fxsalary + (totalSale * 15 /100 );
		String total = String.format("TOTAL = R$ %,.2f", result);
		System.out.println(total);
		
		

	}

}
