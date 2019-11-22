package java_programms;

import java.util.Scanner;

public class Factorial {
	public int Method(int x) {
		if(x==0) {
			return 1;
		}
		else {
			x=x*Method(x-1);
		}
		return x;
	}
	public static void main(String args[]) {
		Factorial f= new Factorial();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a= input.nextInt();
		int b= f.Method(a);
		System.out.println(b);
	}
}