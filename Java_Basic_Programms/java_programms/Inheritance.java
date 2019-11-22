package java_programms;


// Inheritance and Super Keyword to define variables of Parent class
class InheritSuper {
	int speed=37;
	int km=387;
}
class Test extends InheritSuper {
	int milestone=186;
	void display() {
		System.out.print("Speed : "+super.speed+" km/h"+"\n"+"Kilo Meters : "+super.km+" km"+"\n" +"Mile Stone : "+milestone+" km");
	}
}
class Inheritance {
	public static void main(String args[]) {
		Test obj=new Test();
		obj.display();
	}
}