package java_programms;

public class StaticVariable {
	static int c=-1;
	public void Method() {
		c++;
		System.out.println(c);
	}
	public void Method1() {
		c++;
		System.out.println(c);
	}
	StaticVariable(){
		c++;
		System.out.println(c);
	}
	public static void main(String args[]) {
		StaticVariable s= new StaticVariable();
		StaticVariable s1= new StaticVariable();
		StaticVariable s2= new StaticVariable();
		s.Method();
		s.Method();
		s.Method();
	}
}
