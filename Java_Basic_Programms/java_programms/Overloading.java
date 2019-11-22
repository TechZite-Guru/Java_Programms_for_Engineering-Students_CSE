package java_programms;

public class Overloading {
	public void my(int a, int b){
		System.out.print(" Babu");
		System.out.println("  "+(a+b));
	}
	public void my(int a) {
		System.out.print("Aravind");
	}
	public static void main(String args[]) {
		Overloading hi=new Overloading();
		hi.my(9);
		hi.my(9,7);
	}
}
