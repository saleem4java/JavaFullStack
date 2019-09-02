package com.saleemm.learnJava.basics2;

public class Loops {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array
		int customers[] = {1,2,3,4,5,6,7,8};
		System.out.println(customers[0]);
		
		//Three types of loops
		
		int size = customers.length;
		System.out.println("Size of customer Array :: " + size);
		
		int index = 0;
		while(index < size) {
		System.out.println("Sending Email to customer number ::" + customers[index]);
			index++;
		}
		// use while loop when you are dependent  on condition for number of itenrations.
        System.out.println("Jumped out of while loop");
        
        //block first and condition later
        
        index = 4;
        do {
    		System.out.println("Sending Email to customer number ::" + customers[index]);
    			index++;
    	}while(index < size);
        
        // for -- strating point, end point, increment
        for (int i = 0 ; i< size ; i++) {
        	System.out.println("Sending Email to customer number ::" + customers[i]);
        }
        
        // foreach loop
        for (int eachCustomer: customers) {
        	System.out.println("This is from each loop : Customer" + eachCustomer);
        } 
        
	}

}
