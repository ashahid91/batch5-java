package com.noorteck.java.IQ;

public class Q1 {
	
	
	// Q1 Write a java program to reverse String
	
	/**
	 * Access Modifier: Public
	 * Non access modifier : static
	 * Return type : void
	 * methodname: reverseString
	 * parameter(String str) 
	 	testdata
	 	
	 	Java , --> avaJ
	 	Java Programming language --> egaugnal gnimmargorP avaJ
	 */
	public static void main(String[] args) {
		reverseString("Java");
	}
	public static void reverseString(String str) {
		// Convert string to char array					0,1,2,3
		// using toCharArray method from string class [j,a,v,a] array length 4
		char [] strArray = str.toCharArray();
		String newStr = "";
		
		// loop through array 
		
		for (int i = strArray.length-1; i>=0; i--) {
			newStr= newStr + strArray[i];
			System.out.println(newStr);
		}
		
		
		
		System.out.println(newStr);
		
		
	}

	 
		
	
}
