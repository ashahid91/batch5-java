package com.noorteck.java.IQ;

public class Q9 {
	// Q9. Write a java program to reverse sentence word by word.

	/*
	 * Access modifier: public non-access modifier: static return type: void method
	 * name : reverseSentence parameter: (String str)
	 * 
	 * 
	 * Test Data:
	 * 
	 * "Who ate my candy" --> candy my ate Who [Who, ate, my,candy]
	 * 
	 * "Is Java invited for thanksgiving dinner" --> dinner thanksgiving for invited
	 * Java Is
	 
	 */
	
	public static void main(String[] args) {
		reverseSentece("Who ate my candy");
	}
	public static void reverseSentece(String str) {
		
		// convert string to array by using split()
											//	0	1		2	3
		String [] strArray = str.split(" "); // [Who, ate, my,candy]
		
		String nStr ="";
		for(int i = strArray.length-1; i>=0; i--) {
			nStr = nStr+ " "+ strArray[i];
			
		}
		
		System.out.println(nStr);

	}
}
