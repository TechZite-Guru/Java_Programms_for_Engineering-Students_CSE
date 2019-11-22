package java_programms;

import java.util.Scanner;

public class ArraySort {
	public static void main(String args[]) {
		Scanner i= new Scanner(System.in);
		System.out.println("No.of elements in an Array:");
		int a= i.nextInt();
		int x[]=new int[a];
		System.out.println("Enter all the elemnets:");
		for(int b=0; b<a; b++) {
			x[b]= i.nextInt();
		}
		int temp= 0;
		for(int c=0; c<x.length; c++) {
			for(int d=c+1; d<x.length; d++) {
				if(x[c]<x[d]) {
					temp= x[d];
					x[d]= x[c];
					x[c]= temp;
				}
			}
		}
		for(int c=0; c<x.length; c++) {
			System.out.println(x[c]);
		}
	}
}
