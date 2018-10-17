package objectAndClasses;

public class LocalVariables {
	public void pupAge() {
		int age = 0; // this is the local variable
		age = age + 7;
		System.out.println("Puppy Age is : " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalVariables local = new LocalVariables();
		local.pupAge();
	}

}
