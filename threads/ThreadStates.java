package threads;

public class ThreadStates {
	public static void main(String args[]) {
		Thread.State[] States = Thread.State.values();
		for(Thread.State st:States) {
			System.out.println(st);
		}
	}
}
