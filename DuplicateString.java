package com.akash;
//Duplicate in a String
public class DuplicateString {
	public static void main(String[] args) {
		String s = "greatelearning";
		int count = 0;
//		System.out.println(s.length());	==>	14
//		System.out.println(s.indexOf("e", 3));	==>	5 
		
		//Converts given string into character array  
        char string[] = s.toCharArray();
//        System.out.println(string);	==>	greatelearning
        
        System.out.println("Duplicate Characters are:");
        
        //Counts each character present in the string  
        for(int i = 0; i < string.length; i++) {
        	for(int j = i+1; j < string.length; j++) {
        		if(string[i] == string[j]) {
        			  System.out.print(string[j] + " ");
        			  count++;
        			  break;
        		}
        	}
      
        }
	}
}
