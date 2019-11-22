package java_programms;

public class CmdArguments {
	public static void main(String args[]) {
		System.out.println("First : "+args[0]);
		System.out.println("Second : "+args[1]);
		int a = Integer.parseInt(args[2]);
		System.out.println("First:"+args[2]);
		for (int i=1; i<=10; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}
