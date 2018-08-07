package com.edureka.advancedjava.module3t4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.edureka.advancedjava.module3t4.Event;
import com.edureka.advancedjava.module3t4.EventListener;

public class EventSource extends Thread{
    private List<EventListener> listeners = new ArrayList<EventListener>();
    
    // A specific listener should be registered to react to the event source
    public void registerListener(EventListener listener){ 
    	synchronized (listeners) {
    		this.listeners.add(listener);
		}   	
    }
    
    @Override
    public void run(){
    	Random x = new Random();
    	while(true){
    	//get a random number between 0 and 1.
    		double expected_number = x.nextDouble();
    	// use the double class to get a random number and time 10^10000 to generate a number at 10000th decimal place.
    		Double en = expected_number * 10000; // Here a wrapper Double is need, because a method .intValue is used.
    		Integer i = en.intValue(); 
    		if(i % 2 == 0){
    			int expected_digit = i % 10;
    			Event evt = new Event(expected_number, expected_digit);
    			synchronized (listeners){
    				for (EventListener observer : this.listeners){
    					observer.notifyEvent(evt);
    					}
    				}
    			}
        }
    }
}
