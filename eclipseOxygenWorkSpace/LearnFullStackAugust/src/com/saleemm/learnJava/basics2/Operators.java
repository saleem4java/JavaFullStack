package com.saleemm.learnJava.basics2;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int variableOne = 100;
		int variableTwo = 100;
		
		System.out.println("Additions : : " + (variableOne + variableTwo));
		System.out.println("Additions : : " + (variableOne - variableTwo));
		System.out.println("Additions : : " + (variableOne * variableTwo));
		System.out.println("Additions : : " + (variableOne / variableTwo));
		System.out.println("Additions : : " + (variableOne % variableTwo));

		//Comparison < > <= >= != == instance of
		//boolean result  =  variableOne > variableTwo;
		System.out.println("Greater than ::" + (variableOne > variableTwo));
		System.out.println("Greater than or equals ::" + (variableOne >= variableTwo));
		System.out.println("Less  than ::" + (variableOne < variableTwo));
		System.out.println("Less than or equals::" + (variableOne <= variableTwo));
		System.out.println("Not Equals  ::" + (variableOne != variableTwo));
		System.out.println("Equals ::" + (variableOne == variableTwo));
		
		//Logical Operators -- AND OR  NOT  && ||  !
		boolean varOne = true;
		boolean varTwo = false;
		
		/**
		 * AND  -- &&
		 * S1  && S2   R
		 * T       T   T
		 * T       F   F
		 * F       T   F
		 * F       F   F
		 * 
		 * OR - !!
		 * S1   || S2  R
		 * T       T   T
		 * T       F   T
		 * F       T   T
		 * F       F   F
		 * 
		 * 
		 */
		System.out.println( "varOne && varTwo :: " + (varOne && varTwo ));
		System.out.println( "varOne ||  varTwo :: " + (varOne ||  varTwo ));
		System.out.println( "Not  varOne  :: " + !varOne );
		System.out.println( "Not  varTwo :: " + !varTwo );


	}

}
