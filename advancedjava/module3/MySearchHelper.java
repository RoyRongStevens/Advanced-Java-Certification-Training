package com.edureka.advancedjava.module3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySearchHelper {
    public Integer[] search(Double[] list, Double number){
    	List <Integer> al = new ArrayList<Integer>();
    	for(int i = 0; i < list.length; i++){
    		if(list[i].equals(number)){
    			al.add(i); // collect all the index
    		}
    	}
    	Integer[] array_int = new Integer[al.size()]; // obtain the size
    	array_int = al.toArray(array_int); // .toArray need an argument (size)
    	return array_int; // return the class name and a memory address
    }


public static void main(String[] args){
	MySearchHelper sh = new MySearchHelper();
	Double[] list = new Double[] {1.2,2.3,3.4,4.5,5.6,1.2,2.3,1.2};
	Integer[] al = sh.search(list, 1.2);
    System.out.println("The index of the input numbers are: ");
    System.out.println(Arrays.toString(al)); // transform address to string

}
}