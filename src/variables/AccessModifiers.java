package variables;

public class AccessModifiers {

	public String public_val;
	String default_val;
	private String private_val;
	protected String protected_val;
	private String another_private;
	
	public final String final_val;
	
	static String static_val;
	
	
	
	public AccessModifiers() {
		final_val = "I am done !";
	}

	public String toString() {
		
		String s;
		s = "public: " + public_val + " Default: " + default_val  + " Private: " +private_val + " Protected: " +protected_val ;
		
		return s;
	}
	
	public String getName() {
		return private_val;
	}
	
	public void setName(String private_val) {
		this.private_val = private_val;
	}
	
	protected void setAnotherPrivate(String s) {
		this.another_private = s;
	}
	
	public String getAnotherPrivate() {
		return another_private;
	}
	
	

	
}
