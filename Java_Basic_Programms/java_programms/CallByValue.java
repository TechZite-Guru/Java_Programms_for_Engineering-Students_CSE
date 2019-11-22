package java_programms;

public class CallByValue { 
	public void Method(int x,int y) {
		x++;
		y++;
		System.out.println(+x+","+y);
	}
	
	public static void main(String args[]) {
		int a=23;
		int b=43;
		//Creating Instance of the Class
		CallByValue obj=new CallByValue();
		obj.Method(a,b);  // Calling Method and and passing values
		System.out.println(+a+","+b);
	}
}
