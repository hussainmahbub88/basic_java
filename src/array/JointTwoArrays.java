package array;

public class JointTwoArrays {

	public static void main(String[] args) {
//		int[] a = { 1, 2, 3 };
//		int[] b = { 4, 5, 6 };
//
//		int[] c = new int[a.length + b.length];
//		int joint = 0;
//		
//		for (int i = 0; i < a.length; i++) {
//			c[i] = a[i];
//			joint++;
//		}
//		for (int i = 0; i < b.length; i++) {
//			c[joint++] = b[i];
//		}
//		for (int i = 0; i < c.length; i++) {
//			System.out.println(c[i]+ " ");
//		}
		
		//initial array
        int[] oldArray = {1,2,3,4,5};
 
        //new value
        int newValue = 10;
 
        //define the new array
        int[] newArray = new int[oldArray.length + 1];
 
        //copy values into new array
        for(int i=0;i < oldArray.length;i++)
            newArray[i] = oldArray[i];
        //another solution is to use 
        //System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
 
        //add new value to the new array
        newArray[newArray.length-1] = newValue;
 
        //copy the address to the old reference 
        //the old array values will be deleted by the Garbage Collector
        oldArray = newArray;
		
	}

}
