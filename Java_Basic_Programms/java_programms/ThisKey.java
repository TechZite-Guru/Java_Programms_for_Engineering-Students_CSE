package java_programms;

public class ThisKey {
	
	//Declaring Variables	
	public int var;
	public int var1;
	public String name;
	
	
	public void Test1() {	
		this.my();	//Calling the Method my()
	}
	
	public void my() {
		System.out.println("Aravind");
	}
	
	//Parameterized Constructor 1	
	ThisKey(int var,String name){
		this.var=var;
		this.name=name;
	}
	
	//Parameterized Constructor 2
	ThisKey(int var,String name,int var1){
		this(var,name);	//Reusing Constructor
		this.var1=var1;
	}
	
	//Print	
	void Display() {
		System.out.println(+var+","+var1+","+name);
	}
	public static void main(String args[]) {
		ThisKey A=new ThisKey(7,"Babu");	   //Passing parameters to constructor
		ThisKey B=new ThisKey(8,"Aravind",9); //Passing parameters to constructor
		A.Test1();
		A.Display();
		B.Display();
		
		//END
		
	}
}
