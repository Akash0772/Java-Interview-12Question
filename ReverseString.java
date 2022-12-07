package com.akash;
//Q5. Reverse string without using reverse function
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		//input in string by user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string word");
		String s = sc.nextLine();
		//System.out.println(s);
		for(int i = s.length(); i > 0; i--) {
			System.out.print(s.charAt(i-1));
		}
	}
}
