package java_programms;

public class StaticKey {
	public int var;
	public int var1;
	public int x;
	public static int result;     // Static Variable
	public static String name="IIIT";		// Static String
	
	// Constructor
	StaticKey(int a,int b){
		var=a;
		var1=b;
	}
	
	// Changing static string name in string method
	static void my() {
		name="RGUKT";
	}
	
	// Static method
	static int Square(int x) {
		return x*x;
	}
	
	//Static Block executes directly without any calling block
	static {
		int a=8;
		int b=6;
		int c=a+b;
		System.out.println(+c);
		
	}
	void Display() {
		System.out.println(+var+","+var1+","+name);
	}
	
	//Main method always Static
	public static void main(String args[]) {
		StaticKey.my();     // Calling my() method 
		StaticKey obj=new StaticKey(7,8);
		StaticKey obj1=new StaticKey(5,6);
		obj.Display();
		obj1.Display();
		result=StaticKey.Square(9);		// Calling Static Method with Class reference
		System.out.println(+result);
	}
}
