package objectAndClasses;

public class ClassVariables {

	// salary variable is a private static variable
	private static double salary;

	// DEPARTMENT is a constant
	public static final String DEPARTMENT = "Development";

	public static void main(String[] args) {
		salary = 1000;
		System.out.println(DEPARTMENT + " average salary: " + salary);

		ClassVariables e1 = new ClassVariables();
		ClassVariables e2 = new ClassVariables();
		e1.salary = 9990;
		System.out.println(DEPARTMENT + " average salary: " + e2.salary);
	}

}
