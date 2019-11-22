package java_programms;

public class CallByRef {
	int a,b;
	
	// Constructor, taking values of 'x' and 'y' and assigning them to 'a' and 'b' respectively
	CallByRef(int x,int y){
		a=x;
		b=y;
	}
	
	// Method that is taking object of main class as reference
	public void Method(CallByRef obj) {
		obj.a++;
		obj.b++;
	}
	
	// Main Method
	public static void main(String args[]) {
		CallByRef object=new CallByRef(23,43);    // Instance of the class
		object.Method(object);    // Calling Method by Reference
		System.out.println(+object.a+","+object.b);
	}
}
