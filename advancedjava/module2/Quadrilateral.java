package com.edureka.advancedjava.module2;

public abstract class Quadrilateral {
       
    private int base, height;
    
    // Default constructor
	Quadrilateral(){};
	
	//Parameterized Constructor 
	Quadrilateral(int base, int height){
		this.base = base;
		this.height = height;
	}
	
	public abstract double area();
    
    // Gets the base of the quadrilateral
    public int getBase(){
    	return this.base;
    }
    
    // Set the base
    public void setBase(int base){
    	this.base = base;
    }
    
    // Gets the height of the quadrilateral
    public int getHeight(){
    	return this.height;
    }
    
    // Set the height
    public void setHeight(int height){
    	this.height = height;
    }
    
}





