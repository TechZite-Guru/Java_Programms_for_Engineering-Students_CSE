package threads;

public class ThreadDaemon {
	public static void main(String args[]) {
		new test(false).start();
		try {
			Thread.sleep(7500);
		}
		catch(InterruptedException e) {}
			System.out.println("Main Thread Ending");
		
	}
}
class test extends Thread {
	boolean isDaemon;
	public test(boolean isDaemon) {
		// TODO Auto-generated constructor stub
		this.isDaemon= isDaemon;
		setDaemon(isDaemon);
	}
	public void run() {
		System.out.println("I am a"+(isDaemon?"DaemonThread":"UserThread(non-daemon)"));
		int counter=0;
		while(counter<10) {
			System.out.println("Thread doing"+counter);
			counter++;
			
			try {
				sleep(5000);
			}
			catch(InterruptedException e) {
				
			}
		}
		System.out.println("Thread ends");		
	}
}
