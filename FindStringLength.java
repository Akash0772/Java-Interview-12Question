package com.akash;
//How to find the length of the string without using length
import java.util.Scanner;
public class FindStringLength {
	public static void main(String[] args) {
		
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String s = sc.next();
		
		//store a count value
		int count = 0;
		
		//count string character 1 by 1
		for(char cl : s.toCharArray()) {
//			System.out.print(i);
			count++;
		}
		System.out.println("length of the String " + count);
//		using length Method
//		System.out.println(s.length());
	}
}
