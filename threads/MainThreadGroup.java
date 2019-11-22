package threads;

public class MainThreadGroup implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[]) {
		MainThreadGroup mtg= new MainThreadGroup();
		ThreadGroup tg1= new ThreadGroup("MAIN THREAD GROUP");
		Thread t1= new Thread(tg1, mtg,"one");
		t1.start();
		Thread t2= new Thread(tg1, mtg,"two");
		t2.start();
		Thread t3= new Thread(tg1, mtg,"three");
		t3.start();
	}
}
