package java_programms;


// Single level Inheritance
class Ara {
	void MethodA() {
		System.out.println("Aravind");
	}
}
class B extends Ara {
	void MethodB() {
		System.out.println("Babu");
	}
}
public class SingleInheritance {
	public static void main(String args[]) {
		B obj= new B();
		obj.MethodA();
		obj.MethodB();
	}
}
