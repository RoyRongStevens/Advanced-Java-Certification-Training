package com.edureka.advancedjava.module2;

public class StringSearch extends AbstractSearch{
	
	@Override
	public boolean search(Object [] obj_list, Object obj){
	    
		// set up a boolean variable to check the result 
		boolean stringexist = false;
	    
		// check the existence of obj by a for loop
	    for(Object ob : obj_list) { // iterate all the elements in obj_list, each element is named as ob 
	    	if (ob.equals(obj)){ // If found, the output should be true
	    		stringexist = true;
	    	}
	    }
	    return stringexist;
	}
	
	// simple test for the program
	public static void main(String[] args) {
		Object[] li = new Object[3];
        String [] stringList = {"Mary", "Tony", "Jack"};
    	for(int i = 0; i < 3; i++){
    		li[i] = stringList[i];
    	}	
		//for(int i = 0; i<3; i++) {
		//	li[i] = String.valueOf(i);
		//}	
		StringSearch result_ssr = new StringSearch();
		System.out.println(result_ssr.search(li, "Mary"));
		
	}
}