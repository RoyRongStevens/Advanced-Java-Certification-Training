package com.edureka.advancedjava.module2;

class Square extends Quadrilateral {
    private int length;
    Square(int base, int height){
    	super(base, height);
    	this.length = height;
    }
    
    // Gets the length
    public int getLength(){
    	return this.length;
    }
    
    // Set the width
    public void setLength(int length){
    	this.length = length;
    }
    
    // Calculate the area
    public double area() {
    	return (double) length * length;
    }
}
