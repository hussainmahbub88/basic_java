package objectAndClasses;

import java.io.*;

public class InstanceVariables {

	// this instance variable is visible for any child class.
	public String name;

	// salary variable is visible in InstanceVariables class only.
	private double salary;

	// The name variable is assigned in the constructor.
	public InstanceVariables(String empName) {
		name = empName;
	}

	// The salary variable is assigned a value.
	public void setSalary(double empSal) {
		salary = empSal;
	}

	// This method prints the employee details.
	public void printEmp() {
		System.out.println("name  : " + name);
		System.out.println("salary :" + salary);
	}

	public static void main(String args[]) {
		InstanceVariables empOne = new InstanceVariables("Ransika");
		empOne.setSalary(1000);
		empOne.printEmp();
	}
}
