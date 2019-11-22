package java_programms;

public class ThrowKey {
	public void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Not Valid");			
			}
		else {
			System.out.println("Eligible to Vote");
		}
	}
	public static void main(String args[]) {
		ThrowKey a = new ThrowKey();
		try {
			a.validate(12);
		}
		catch(ArithmeticException e) {
			System.out.println("Not Eligible to Vote");
		}
	}
}
 