package uri_online;

import java.util.Scanner;

public class AverageOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float A,B,res;
		Scanner sc = new Scanner(System.in);
		 A = sc.nextFloat();
		 B = sc.nextFloat();
		 
		 res = (float) (((A*3.5)+(B*7.5))/(3.5+7.5));
		 String media = String.format("MEDIA = %,.5f", res);
		 System.out.println(media);

	}

}
