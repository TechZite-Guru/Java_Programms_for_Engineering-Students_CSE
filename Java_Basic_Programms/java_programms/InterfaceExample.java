package java_programms;

interface Trial {
	int a=20;
	void Method();
	void Method1();
}
public class InterfaceExample implements Trial {
	@Override
	public void Method() {
		// TODO Auto-generated method stub
		System.out.println("First Method");
		System.out.println(a*a+a);
	}
	@Override
	public void Method1() {
		// TODO Auto-generated method stub
		System.out.println("Second Method");
	}
	
	public static void main(String args[]) {
		InterfaceExample obj= new InterfaceExample();
		obj.Method();
		obj.Method1();
		System.out.println(Trial.a);
	}
}