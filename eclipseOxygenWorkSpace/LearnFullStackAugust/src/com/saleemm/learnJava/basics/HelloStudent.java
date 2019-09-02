package com.saleemm.learnJava.basics;
//Creating project
//github repository
//Package
//creating a class
//Variables -- 8 primitive and String
//Static and Instance Variables
//Access Modifiers
//Create objects -- Accessing variables with objects



public class HelloStudent {
	
	//vaiables ==> Data Carriers
	//Data Types
	//Eight primitive data types
	//numeric data
	
	byte byteData = 99;
	short shortData = 9999;
	int intData = 999999999;
	long longData = 9999999999999L; //Only here java is not case sensitive. L or l
	//Decimals
	float floatData = 99.99f;
	double doubleData = 999.9999;
	//Character Data
	char charData = 'A'; //single quotes and single character
	//Boolean
	boolean boolData = false;
	
	//Non Premitive,  but used like a primitive
	String strData  = "Hello Students!!"; //This is a String. From a single character to a book"; 

	//Class level Data
	static String companyName = "H2kInfosys Inc.";
	
	//Access Modifiers
	
	/**
	 * Access Modifier
	 * public  -- Accessible to anyone
	 * private -- No one except that class has access to it.
	 * protected -- class and its children can access it.
	 * default -- package access -- all the classes within the same package has access to it.
	 * @param args
	 */

	//methods ==> Data processors
	
	// main method is the strating point of java execution.
	public static void main (String[] args ) {
		//Object of a class
		//ClassName userDefinedObjectName = new className();
		HelloStudent hello = new HelloStudent(); //hello is object of cloass HelloStudent
		System.out.println(hello.strData);
		//Variables created directly under the class are called instance variables.
		//Variables are attached to instance/
		
		HelloStudent helloWorld = new HelloStudent(); //hello is object of cloass HelloStudent
		helloWorld.strData = "Hello World";
		HelloStudent.companyName = "Best Buy Inc.";

		System.out.println(helloWorld.strData);
		System.out.println(hello.strData);
		
		System.out.println(HelloStudent.companyName);
		System.out.println(HelloStudent.companyName);
		
		//Static Data should be access with class name
		
		
		
	}
	

}
