package com.akash;
//Q1. Swap string without 3rd variable?
import java.util.Scanner;
public class SwapString {
	public static void main(String[] args) {
	/*	
	 	String a = "Hello";
					01234
		String b = "World";
					01234
	*/		
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String value a ");
		String a = sc.next();
		System.out.println("Enter String value b ");
		String b = sc.next();
		System.out.println("String before swap: a = " + a + " and b = " + b);
		
//		step 1 concatenate and count total word length 10
		a = a + b; //HelloWorld
//		index		 0123456789
//		System.out.println(a);
		
//		store initial string a in string b
		b = a.substring(0, a.length() - b.length());
//								10 - 5 = 5
//		b = a.substring(0, 5)
//		System.out.println(b);
		
//		store initial string b in string a
		a = a.substring(b.length());
//		a = a.substring(5);
		
		System.out.println("String after swap: a = " + a + " and b = " + b);
	}
}
