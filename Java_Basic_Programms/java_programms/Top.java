package java_programms;

class Tom {
	public void my() {
		System.out.println("KOVA");
	}
}
class Tom2 extends Tom{
	public void my() {
		System.out.println("OOPS");
	}
}
public class Top {
	public static void main(String args[]) {
		Tom b=new Tom();
		b.my();
		Tom2 c=new Tom2();
		c.my();
	}
}