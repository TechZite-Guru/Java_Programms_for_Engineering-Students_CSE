package java_programms;

import java.util.Scanner;
import java.util.*;
public class StringReverse {
	public static void main(String args[]) {
		String reverse = "";
		StringBuffer sb= new StringBuffer();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the String:");
		String a= input.nextLine();
		//Using StringBuffer for reversing String
		for (int i=a.length()-1; i>=0; i--) {
			StringBuffer b= sb.append(a.charAt(i));
			if(i==0) {
				System.out.println("Reverse of given String : "+b);
			}
		}
		//Using General Method to reverse a String
		for (int i=a.length()-1; i>=0; i--) {
			reverse= reverse+a.charAt(i);
		}
		if(a.equals(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("NOT Palindrome");
	}
}
