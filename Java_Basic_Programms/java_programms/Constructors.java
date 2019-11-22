package java_programms;

public class Constructors {
	Constructors(int a, int b){
		int x= a+b;
		System.out.println("Parametrized Constructor");
		System.out.println(x);
	}
	Constructors(String a,String b){
		System.out.print(a+" ");
		System.out.println(b);
	}
	Constructors(String s,int a){
		System.out.println(s);
		System.out.println(a);
		System.out.println("============================");
	}
	Constructors(){
		System.out.println("Non-Parametrized Constructor");
	}
	public static void main(String args[]) {
		Constructors p= new Constructors(2,8);
		Constructors p2= new Constructors("Aravind","Babu");
		Constructors p1= new Constructors("Aravind",3);
		Constructors np= new Constructors();
	}
}
