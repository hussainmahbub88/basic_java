package uri_online;

import java.util.Scanner;

public class BankNotes {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = sc.nextInt();
		
		System.out.printf("%d\n", N);
		System.out.printf("%d nota(s) de R$ 100.00\n",N/100);
		int a = N%100;
		System.out.printf("%d nota(s) de R$ 50.00\n",a/50);
		a=a%50;
		System.out.printf("%d nota(s) de R$ 20.00\n",a/20);
		a=a%20;
		System.out.printf("%d nota(s) de R$ 10.00\n",a/10);
		a=a%10;
		System.out.printf("%d nota(s) de R$ 5.00\n",a/5);
		a=a%5;
		System.out.printf("%d nota(s) de R$ 2.00\n",a/2);
		a=a%2;
		System.out.printf("%d nota(s) de R$ 1.00\n",a/1);
		a=a%1;
		
	}

}
