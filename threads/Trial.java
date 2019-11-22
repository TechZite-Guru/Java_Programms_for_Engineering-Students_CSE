package threads;

public class Trial extends Thread{
	public void run() {
		System.out.println("Hello....");
	}
	public static void main(String args[]) {
		Trial t= new Trial();
		t.start();
	}
}
