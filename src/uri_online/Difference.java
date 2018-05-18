package uri_online;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B,C,D;
		Scanner sc = new Scanner(System.in);
		 A = sc.nextInt();
		 B = sc.nextInt();
		 C = sc.nextInt();
		 D = sc.nextInt();
		 
		 int difference = (A * B - C * D);
		 System.out.println("DIFERENCA = "+difference);

	}

}
