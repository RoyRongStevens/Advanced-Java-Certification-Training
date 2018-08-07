package com.edureka.advancedjava.module3t4;

//the status of event should be defined in Event and invoked in EventListener
public class Event {
 private double expected_number; // actual data
 private int expected_digit; // header 
 
 // constructor 
 public Event(Double expected_number, int expected_digit){
 	this.expected_number = expected_number;
 	this.expected_digit = expected_digit;
 }

 // getters
	public double getexpected_number() {
		return expected_number;
	}

	public int getexpected_digit() {
		return expected_digit;
	}
}
