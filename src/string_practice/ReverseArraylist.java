package string_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mamun");
		list.add("Hussain");
		list.add("Tushar");
		list.add("Chakrabharty");
		
		System.out.println("Before Reverse: "+list);
		
		Collections.reverse(list);
		
		System.out.println("After Reverse: "+list);
		
		
		//Constructing a LinkedList
        
        LinkedList<Integer> list1 = new LinkedList<Integer>();
         
        list1.add(56);  
        list1.add(67);         
        list1.add(81);        
        list1.add(41);        
        list1.add(63);       
        list1.add(21);   
        list1.add(96);
         
        //Printing list before reverse
         
        System.out.println("LinkedList Before Reverse :");
         
        System.out.println(list1);
         
        //Reversing the list using Collections.reverse() method
         
        Collections.reverse(list1);
         
        //Printing list after reverse
         
        System.out.println("LinkedList After Reverse :");
         
        System.out.println(list1);
	}

}
