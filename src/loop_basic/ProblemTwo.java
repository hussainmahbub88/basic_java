package loop_basic;

public class ProblemTwo {

	public static void main(String[] args) {
		/*
		 * **** 
		 * *##* 
		 * *##* 
		 * ****
		 

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == 1 || i == 4 || j == 1 || j == 4) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}*/	
		
		
		/*
		 * **** 
		 * *  * 
		 * *  * 
		 * ****
		 

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == 1 || i == 4 || j == 1 || j == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		
		
		
		/*
		 * ****
		 * #### 
		 * ****
		 * ####
		 

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i % 2 ==0) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}*/

		
		/*
		 * *#*# 
		 * #### 
		 * *#*# 
		 * ####
		 

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i % 2 == 0 || j % 2 == 0) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		} */
		
		
		/*
		 * *#*#
		 * #*#*
		 * *#*#
		 * #*#*
		 
		
		for (int i = 1; i <= 4 ; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i==1&&j==2 || i==1&&j==4 || i==2&&j==1 || i==2&&j==3 || i==3&&j==2 || i==3&&j== 4 || i==4&&j==1 || i==4&&j==3) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}*/
		
		
		/*
		 * 0101
		 * 1010
		 * 0101
		 * 1010
		 */
		
		for (int i = 1; i <= 10 ; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i%2==0&&j%2==0 || i%2==1&&j%2==1) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
		
	} 

}
