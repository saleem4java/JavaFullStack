package com.saleemm.learnJava.basics;

public class Variables {
	
	
	/**
	 * Instance Variables
	 * Class Variables / static / Reference
	 */
	// Instance variables
	// Properties
	// Primitives -- data types
	// Numeric Data
	
	
	byte byteData =  99;
	short shortData =  9999;
	int intData = 999999999;
	long longData = 9999999999L; // L or l , case is not sensitive only here
	
	// Decimals
	float floatData = 1212.21233f;
	double doubleData =  1212.21233;
	
	//character
	char charData = 'A' ; // Single quote , only one char
	
	// Boolean
	boolean boolData  = false;
	
	// String -- Non Primitive
	// 
	String strData = "Anything .. from single char to a book;";
	
	//Class Level variables (static) // Reference variables.
	//These are common values for all
	static String companyName = "H2kInfosys Inc";
	
	
	public static void main(String[] args) {
		Variables varOne = new Variables();
		Variables.companyName = "Best Buy Inc.";
		varOne.strData = "I am giving new value ";
		
		System.out.println(varOne.strData);
		System.out.println(varOne.companyName);

		
		Variables varTwo = new Variables();
		System.out.println(varTwo.strData);
		System.out.println(varTwo.companyName);

		
		
	}
			
	
	
}
