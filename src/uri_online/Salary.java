package uri_online;

import java.util.Scanner;

public class Salary {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the employee's number :");
		int A = sc.nextInt();
		
		System.out.println("Enter the number of worked hours :");
		int B = sc.nextInt();
	
		System.out.println("Enter the amount recieved per hour :");
		float C = sc.nextFloat();
		
		float salary = B*C ;
		System.out.println("NUMBER = "+A);
		String sal = String.format("SALARY = U$ %,.2f", salary);
		System.out.println(sal);
		
		
	}

}
