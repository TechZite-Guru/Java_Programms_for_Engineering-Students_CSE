package java_programms;

public class ThrowsKey {
	public static void Method1() throws ArithmeticException,IllegalAccessException {
		System.out.println("Error");
		throw new IllegalAccessException();
	}
	@SuppressWarnings("null")
	public static void Method2() throws NullPointerException {
		String s= null;
		System.out.println(s.length());
	}
	public static void main(String args[]) {
		try {
			Method1();
		}
		catch(ArithmeticException e) {
			System.out.println("Aravind");
		}
		catch(IllegalAccessException f) {
			System.out.println("Babu");
		}
		try {
			Method2();
		}
		catch(NullPointerException g) {
			System.out.println("Jagarlamudi");
		}
		finally {
			System.out.println("Exception Handled Successfully");
		}
	 }
}
