package com.edureka.advancedjava.module2;

public class IntegerSearch extends AbstractSearch{
	
	@Override
	public boolean search(Object [] obj_list, Object obj){
	    
		// set up a boolean variable to check the result 
		boolean intexist = false;
	    
		// check the existence of obj by a for loop
	    for(Object ob : obj_list) { // iterate all the elements in obj_list, each element is named as ob 
	    	if (ob.equals(obj)){ // If found, the output should be true
	    		intexist = true;
	    	}
	    }
	    return intexist;
	}
	
	// simple test for the program
	public static void main(String[] args) {
		Object[] li = new Object[5];
		for(int i = 0; i < 5; i++){
			li[i] = i;
		}
		IntegerSearch result_isr = new IntegerSearch();
		System.out.println(result_isr.search(li, 4));
	}
	
}
