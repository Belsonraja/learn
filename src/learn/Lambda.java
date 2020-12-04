package learn;

public class Lambda {
	
	public void greet() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		Lambda l = new Lambda();
		l.greet();
		
		//() -> System.out.println("Welcome");
		
	}

}
