package java_programms;
import java_programms.StaticVariable;

public class StaticMethod extends StaticVariable{
	static int a=10;
	static void Method2(int b) {
		//We can only access Static variables and methods to a Static Method
		System.out.println(a);
		b++;
		System.out.println(b);
	}
	static void Method3() {
		//c is a Static Variable imported from StaticVariable Class
		System.out.println(c);
	}
	public static void main(String args[]) {
		StaticMethod.Method2(StaticVariable.c);
		StaticMethod.Method3();
	}
}
