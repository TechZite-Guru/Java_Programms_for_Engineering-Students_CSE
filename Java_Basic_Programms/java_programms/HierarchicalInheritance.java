package java_programms;

class W {
	void Method1() {
		System.out.println("CSE");
	}
	void Method7() {
		System.out.println("CSE-4");
	}
}
class X extends W {
	void Method2() {
		System.out.println("ECE");
	}
}
class Y extends W {
	void Method3() {
		System.out.println("CE");
	}
}
class Z extends W {
	void Method4() {
		System.out.println("MME");
	}
	void Method7() {
		System.out.println("CSE-2");
	}
}
public class HierarchicalInheritance {
	public static void main(String args[]) {
		Z obj= new Z();
		obj.Method1();
		obj.Method4();
		X obj2= new X();
		obj2.Method2();
		Y obj3= new Y();
		obj3.Method3();
		W obj4= new Z();
		
		/* By using parent reference to create instance of child class, 
		we can access variable and methods of parent class and the methods
		that are same in parent and child classes, are accessed from the child class.*/
		
		obj4.Method1();
		obj4.Method7();
	}
}
