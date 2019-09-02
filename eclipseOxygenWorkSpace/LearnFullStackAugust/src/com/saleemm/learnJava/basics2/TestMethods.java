package com.saleemm.learnJava.basics2;

public class TestMethods {
/**
 * Understanding method
 * 1.Access Modifier
 * 2.Return Type -- output  (no return is void)
 * 3.Method Name -- Alway Camel Case (getCustomerDetails(), get and set are called accessors)
 * 4.Arguements -- Parameters for methods
 * 5.Method Body -- {}
 * 6.Exceptions 
 * @param args
 */
	
	public String getCustomerDetails(int custId){
		String text = "Customer with ID :: " + "custId";
		return  text;
	}
	
	public int sumOfStartToEnd(int startValue, int endValue) {
		int sum = 0;
		while (startValue <= endValue) {
			sum =  sum + startValue;
			startValue++;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethods test  = new TestMethods();
		System.out.println( test.sumOfStartToEnd(1, 10));

	}

}
