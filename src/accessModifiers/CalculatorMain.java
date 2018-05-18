package accessModifiers;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.setName("Calculated"); 
		System.out.println(cal.getName() + " after adding and the value is : " +cal.add(5,15));
		System.out.println(cal.getName() + " after subtracting and the value is : " +cal.sub(27,17));
		System.out.println(cal.getName() + " after multiplication and the value is : " +cal.mul(5,5));
		System.out.println(cal.getName() + " after division and the value is : " +cal.div(7,2));
		System.out.println(cal.getName() + " after Add 3 numbers the value is : " +cal.add(1+2+5,1,1));
				
	}
}