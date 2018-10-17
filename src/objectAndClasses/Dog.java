package objectAndClasses;

public class Dog {

	int age;
	String color;

	void barking() {
		System.out.println("Barking");
	}

	void sleeping() {
		System.out.println("Sleeping");
	}

	void setDog(int a, String c) {
		age = a;
		color = c;
	}

	void printDog() {
		System.out.println("This dog age is " + age + " and color is " + color);
	}

	public static void main(String[] args) {
		// Creating two object of Dog Class
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		d1.setDog(10, "Black");
		d1.printDog();

	}

}
