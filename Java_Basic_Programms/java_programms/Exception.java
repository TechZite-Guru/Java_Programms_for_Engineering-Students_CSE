package java_programms;

public class Exception {
	public static void main(String args[]) {
		try {
			int b=5/0;
			System.out.println(b);
		}
		catch(ArithmeticException e){
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println(c);
		}
	}
}
