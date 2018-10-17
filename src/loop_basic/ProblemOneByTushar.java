package loop_basic;

public class ProblemOneByTushar {

	public static void main(String[] args) {
		
		
//		// Print 4 namatha
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("4"+"x"+i+"="+4*i);
//		}
		// Print 50 namatha
		for (int i=1; i<= 50; i++) {
			for (int j=1; j<= 10; j++) {
				System.out.println(i+"x"+j+"="+j*i);
			}
			System.out.println();
		}

	}

}
