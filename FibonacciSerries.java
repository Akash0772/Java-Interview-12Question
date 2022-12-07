package com.akash;
//Q6. Write code to print the Fibonacci series?
import java.util.Scanner;
public class FibonacciSerries {
	public static void main(String[] args) {
		//declaration
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, i, count;
		
		//initialization
		System.out.println("Enter the number first ");
		n1 = sc.nextInt();
		System.out.println("Enter the number second ");
		n2 = sc.nextInt();
		//count the number
		System.out.println("Enter the count number ");
		count = sc.nextInt();
		
		//Display
		System.out.print(n1 + " " + n2);
		
		//loop starts from 2 because 0 and 1 are all ready print
		for(i = 2; i < count; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
