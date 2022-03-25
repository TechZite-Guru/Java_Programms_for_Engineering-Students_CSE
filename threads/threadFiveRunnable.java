class Even extends Thread {
	public void run() {
		
		int n=10;
		for (int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println("EVEN NUMBER:"+i);
			}
		}
	}
}
class Odd extends Thread {
	public void run() {
		int n=10;
		for (int i=1;i<=n;i++) {
			if(i%2==1) {
				System.out.println("ODD NUMBER:"+i);
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
