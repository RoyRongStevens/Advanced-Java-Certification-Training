package com.edureka.advancedjava.module2;

public class Parallelogram extends Quadrilateral {
    private int Side1;
    private int Side2;
    private double Angle; // in degree
    Parallelogram(int base, int height) {
    	super(base, height);
    	this.Side1 = base;
    	this.Side2 = height;
    }
    
	public int getSide1() {
		return Side1;
	}
	public void setSide1(int Side1) {
		this.Side1 = Side1;
	}
    
	public int getSide2() {
		return Side2;
	}
	public void setSide2(int Side2) {
		this.Side2 = Side2;
	}
	
	public double getAngle() {
		return Angle;
	}
	public void setAngle(double Angle) {
		this.Angle = Angle;
	}
	
	public double area() {
		double Angel_radian =  Math.toRadians(Angle);
		double height = Side2 * Math.cos(Angel_radian);
		return (double)(Side1 * height);
	}
	
}
