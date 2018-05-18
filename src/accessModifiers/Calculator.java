package accessModifiers;

public class Calculator {

	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int add(int a,int b) {
		return a + b; 
	}
	
	public int add(int a,int b,int c) {
		return 0 ; 
	}
	
	public int add(double a,int b,int c) {
		return 0; 
	}
	
	public double add(int a,double b,int c) {
		return 0.0; 
	}
	
	
	protected int sub(int a,int b) {
		return a - b; 
	}
	int mul(int a,int b) {
		return a * b; 
	}
	public double div(int a,int b) {
		return (double)a / b; 
	}
	
}
