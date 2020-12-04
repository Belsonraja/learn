package learn;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		A b = new B();
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
		System.out.println(b instanceof C);
		A c = new C();
		System.out.println(c instanceof A);
		System.out.println(c instanceof B);
		System.out.println(c instanceof C);
	}
	
	

}

class A{}
class B extends A{}
class C extends B{}