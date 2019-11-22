package java_programms;

import java.util.Scanner;

public class StringBufferTest {
	public static void main(String args[]) {
		
		// String Buffer
		Scanner input= new Scanner(System.in);
		System.out.println("Enter String:");
		StringBuffer sb= new StringBuffer(input.nextLine());
		sb.append(" Babu");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.insert(0,"J ");
		System.out.println(sb);
		System.out.println(sb.charAt(2));
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.substring(0,2));
		/*
		 * We can't Use Case Conversion in String Buffer
		
		System.out.println(sb.toUpperCase());
		System.out.println(sb.toLowerCase());
		*/
		// String Input	
		System.out.println("================================");
		String s= new String("Aravind");
		System.out.println(s.charAt(4));
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf("a"));
		System.out.println(s.substring(0,2));
	}
}
