package com.akash;
//Q4. Largest Number is an Array
import java.util.Scanner;
public class LargestNumberArray {
	public static int getLargestNo(int arr[]) {
			int largest = Integer.MIN_VALUE;
			for(int i = 0; i < arr.length; i++) {
				if(largest < arr[i]) {
					largest = arr[i];
				}
			}
			return largest;
	}
	public static void main(String[] args) {
		
		//declaration
		Scanner sc = new Scanner(System.in);
		
		//input size by user
		System.out.println("Enter the array size");
		int s = sc.nextInt();
		
		//input array in number by user
		int[] arr = new int[s];
		System.out.println("Enter the array in number");
		for(int i = 0; i < s; i++) {
			arr[i] = sc.nextInt();
			//System.out.println(arr[i] + " ");
		}
		
		//Display
		System.out.println("largest number " + getLargestNo(arr));
	}
}
