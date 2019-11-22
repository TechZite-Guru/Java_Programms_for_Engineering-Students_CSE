package java_programms;

public class Pack1 {
	public void method1() {
		System.out.println("Method1: Public");
	}
	protected void method2() {
		System.out.println("Method2: Protected");
	}
	private void method3() {
		System.out.println("Method3: Private");
	}
	public static void main(String args[]) {
		new Pack1().method1();
		new Pack1().method2();
		new Pack1().method3();
	}
}
