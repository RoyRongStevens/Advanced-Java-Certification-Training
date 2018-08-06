package com.edureka.advancedjava.module2;

public class SuperStudy { // the filename shoule be consistent with the class name
	public void X()
	{ System.out.println("I am in SuperStudy.X()"); }

	public static void main(String[] args) 
	{ 
		SuperStudy ssc = new SuperStudyChild(); // Childcalss should assigned to a parent class instead of SuperStudyChild
		ssc.X(); 
	}
}

class SuperStudyChild extends SuperStudy
{
	public void X()
	{ 
		super.X(); // Child class can access parent class methods by using super
		System.out.println("I am in SuperStudyChild.X()"); 
	}
}
