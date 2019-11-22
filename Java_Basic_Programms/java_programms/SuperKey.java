package java_programms;


// Super Class in Methods
class FullName {
	void method1() {
		System.out.println("ARAVND BABU JAGARLAMUDI");
	}
}
class Name extends FullName {
	void method1() {
		System.out.println("ARAVND BABU");
	}
	void Display() {
		super.method1();  // This executes the method1 of Super class FullName
		method1();
	}
}
public class SuperKey {
	public static void main(String args[]) {
		Name obj= new Name();
		obj.Display();
	}
}
