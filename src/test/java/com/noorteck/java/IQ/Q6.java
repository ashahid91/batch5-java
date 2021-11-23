package com.noorteck.java.IQ;

public class Q6 {
// Write a program to count total number of words in given string
	
	/**
	 * access modifier : public
	 * non- access modifier: static
	 * return type: void
	 * method name: countWords
	 * Parameter (String str)
	 * 
	 * 
	 * Test Data : "I Love Java" --> 3 [I,Love,Java]
	 * 
	 * " I do not want to go to work tomorrow" -->9 
	 
	 * " Who ate my candy" --> 4
	
	 */
	
	
	public static void main(String[] args) {
		countWords("I Love Java" );
		countWords("I do not want to go to work tomorrow");
	}
	
	public static void countWords(String str) {
		// we have to split string by spaces to store in String Array
		
		String [] strArray = str.split(" ");
		System.out.println("This is length: "+ strArray.length);
		
		int count =0;
		
		for(int i =0; i<strArray.length;i++) {
			count++;
		}
		System.out.println(count);
		
		
		int total = 0;
		for(String s : strArray) {
			total++;
		}
		System.out.println("For Enhanced " + total);
		
		
	}
}
