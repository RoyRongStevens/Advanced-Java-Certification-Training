package com.edureka.advancedjava.module3t4;

public class EventDemo {
	//Demo for the program
	public static void main(String[] args) {
		//create an event source object and register the event listener
		EventSource source = new EventSource();
		EventListener numberfoundlistener = new NumberFoundListener();
		source.registerListener(numberfoundlistener);
		//start the thread
		source.start();
	}

}

//implement a class for the event listener interface
class NumberFoundListener implements EventListener {
	
	//when event happens, print out the expected random number
	public void notifyEvent(Event event) {
		System.out.println("Expected number is found: " + event.getexpected_number());
	    System.out.println("The digit at the 10000th decimal place is: " + event.getexpected_digit());
	
	    try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}