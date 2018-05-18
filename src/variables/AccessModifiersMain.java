package variables;

public class AccessModifiersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiers acc = new AccessModifiers();
		acc.public_val = "TOYOTA";
		acc.default_val = "CAMRY";
		acc.protected_val = "4TB5DVG78965";
		acc.setName("Hussain");
		acc.setAnotherPrivate("another one");
		
		acc.static_val = "some thing";		
		AccessModifiers.static_val = "static value";
		acc.static_val = "Some thing";
		
		System.out.println(acc.static_val);
		System.out.println(AccessModifiers.static_val);
		
				
		System.out.println(acc.getAnotherPrivate());
		
		System.out.print(acc);
		//System.out.println(acc.getName());
	}

}
