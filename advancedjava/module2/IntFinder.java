package com.edureka.advancedjava.module2;

import java.util.Scanner;

public class IntFinder {
	
	private static Scanner sc;
	
	public void find(Object [] obj_list, int [] input_list){	    
		
		for(int i = 0; i < input_list.length; i++){
			
			boolean intexist = false;
			
			// check the existence of obj by a for loop
		    for(int j = 0; j < obj_list.length; j++) { // iterate all the elements in obj_list
		    	
		    	if (obj_list[j].equals(input_list[i])){ // If found, the output should be true
		    		
		    		// print the found integer and the index
		    		intexist = true;
		    		int index = j + 1;
		    		System.out.println(input_list[i] + " is found at index of " + index);
		    	} 
		    }
		    
		    // if the integer is not found
		    if(!intexist){
		    	System.out.println(input_list[i] + " is not found");
		    }
					
		}
     
	}
	
	public static void main(String[] args) {
		
		Object[] li = new Object[9];
		for(int i = 0; i < 9; i++) {
			li[i] = i;
		}
		
		System.out.println("Please input 3 integers from 0 to 9");
		
		sc = new Scanner(System.in);
		int[] intput = new int[3];
		for(int i = 0; i < 3; i++){
			intput[i] = sc.nextInt();
		}
		
		
		IntFinder result_ifd = new IntFinder();
		result_ifd.find(li, intput);
	}
	
}
