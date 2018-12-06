package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoArrays {

	public static void main(String[] args) {
		  
		  int[]a = {1,2,3};
		  int num1 = a.length;
		  
	      int[]b = {4,5,6,7,8,9};
	      int num2 = b.length;
	      
	      int[]c = new int[num1 + num2];
	      int joint = 0;
	      
	      for(int i = 0; i< a.length; i++) { 
	         c[i] = a[i];
	         joint++;
	      } 
	    
	      for(int j = 0;j< b.length;j++) { 
	         c[joint++] = b[j];
	      } 
	      
	      for(int i = 0;i< c.length;i++) {
	    	  System.out.print(c[i]+" ");
	   } 
	      
	      
	   
		  
		  /* // String joining
	      String a[] = { "A", "E", "I" };
	      String b[] = { "O", "U" };
	      List list = new ArrayList(Arrays.asList(a));
	      list.addAll(Arrays.asList(b));
	      Object[] c = list.toArray();
	      System.out.println(Arrays.toString(c));*/
	}	      

}
