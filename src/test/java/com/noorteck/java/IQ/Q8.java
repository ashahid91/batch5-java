package com.noorteck.java.IQ;

public class Q8 {
	
	// Q8 Write a java program to remove the specific character from the string
	
	/**
	 * Access Modifier: public
	 * non-access modifier: static
	 * return type: void
	 * method name: removeCharacter
	 * parameter (String str, char character)
	 * 
	 * 
	 * Test Data
	 * 
	 * " teether" remove 'e' --> tthr [t,e,e,t,h,e,r] [t,t,h,r]
	 * " Character" remove 'a' --> Chrcter
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		renoveCharacter("teether", 'e');
		
	}
	
	public static void renoveCharacter(String str, char character) {
		char [] strArray = str.toCharArray(); // [t,e,e,t,h,e,r]
		
		String nStr= "";
		
		for (int i=0; i<strArray.length; i++) {
			if(strArray[i]!=character) {
				nStr= nStr+strArray[i];
			}
		}
		
		System.out.println(nStr);
			
		
	}
	

}
