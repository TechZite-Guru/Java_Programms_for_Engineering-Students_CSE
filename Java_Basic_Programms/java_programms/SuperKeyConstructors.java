package java_programms;


// Super Class in Methods
class FullyName {

	FullyName(int a){
		System.out.println(+a);
		System.out.println("ARAVND BABU JAGARLAMUDI");
	}
}
class Names extends FullyName {
	Names() {
		super(0);  // This executes the Constructor of Super class FullyName
		System.out.println("ARAVND BABU");
	}
	void Display() {
		System.out.println("Super Key Used");
	}
}
public class SuperKeyConstructors {
	public static void main(String args[]) {
		Names obj= new Names();
		FullyName obj1= new FullyName(2);
		obj.Display();
	}
}
