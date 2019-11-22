package java_programms;

class Test6 {
	public static int a= 30;
	void show() {
		System.out.println("JAVA");
	}
	void my1() {
		System.out.println("C++");
	}
}
class A extends Test6 {
	public static int a= 20;
	void show() {
		System.out.println("OOPS");
	}
	void my() {
		System.out.println("PYTHON");
	}
}
class Overriding {
	public static void main(String args[]) {
		Test6 b=new Test6();
		b.show();
		A c=new A();
		c.show();
		Test6 obj= new A();  
		
		/* By using parent reference to create instance of child class, 
		we can access variable and methods of parent class and the methods
		that are same in parent and child classes, are accessed from the child class.*/
		
		obj.my1();
		obj.show();
		System.out.println(+obj.a);  // Variable "a" in Parent class has printed
	}
}
