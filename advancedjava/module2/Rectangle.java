package com.edureka.advancedjava.module2;

public class Rectangle extends Quadrilateral  {
    private int width;
    private int length;
    Rectangle(int base, int height){
    	super(base, height);
    	this.width = base;
    	this.length = height;
    }
    
    // Gets the width
    public int getWidth(){
    	return this.width;
    }
    
    // Set the width
    public void setWidth(int width){
    	this.width = width;
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
    	return (double) width * length;
    }
}  