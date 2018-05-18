package uri_online;

import java.util.Scanner;

public class AverageTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float A,B,C,res;
		Scanner sc = new Scanner(System.in);
		 A = sc.nextFloat();
		 B = sc.nextFloat();
		 C =sc.nextFloat();
		 
		 res = (float) (((A*2)+(B*3)+(C*5))/(2+3+5));
		 String media = String.format("MEDIA = %,.1f", res);
		 System.out.println(media);
	}

}
