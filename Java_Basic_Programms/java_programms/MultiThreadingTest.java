package java_programms;

class Even extends Thread {
	public void run() {
		int i=0;
		for (i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even:"+i);
			}
		}
	}
}
class Odd extends Thread {
	public void run() {
		int i=0;
		for (i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.println("Odd:"+i);
			}
		}
	}
}
public class MultiThreadingTest {
	public static void main(String args[]) throws InterruptedException {
		Even e= new Even();
		Odd o= new Odd();
		e.start();
		e.sleep(200);
		o.start();
	}
}
