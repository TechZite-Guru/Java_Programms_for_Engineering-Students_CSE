package java_programms;


// Multilevel Inheritance in Java
class H {
	void Method1() {
		System.out.println("Aravind");
	}
}
class I extends H {
	void Method2() {
		System.out.println("Mojesh");		
	}
}
class J extends I {
	void Method3() {
		System.out.println("Bhavani");		
	}
}
public class MutiLevelInheritance {
	public static void main(String args[]) {
		J obj= new J();
		obj.Method1();
		obj.Method3();
		obj.Method2();
		I obj2= new I();
		obj2.Method1();
		obj2.Method2();
		H obj3= new J();
		
		/* By using parent reference to create instance of child class, 
		we can access variable and methods of parent class and the methods
		that are same in parent and child classes, are accessed from the child class.*/
		
		obj3.Method1();
	}
}
