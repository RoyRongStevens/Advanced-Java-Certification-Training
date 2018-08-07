package com.edureka.advancedjava.module3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// EventSource is front desk, linking to outside change
public class EventSource extends Thread{
    private List<EventListener> listeners = new ArrayList<EventListener>();
    
    // A specific listener should be registered to react to the event source
    public void registerListener(EventListener listener){ 
    	synchronized (listeners) {
    		this.listeners.add(listener);
		}   	
    }
    
    public void run(){
    	Random x = new Random();
    	String[] sources = {"Mouse", "Keyboard", "Screen", "Network"};
    	String[] payloads = { "Payload1", "Payload2", "Payload3", "Payload4"};
    	while(true){
    		int index = x.nextInt(4);
    		String payload = payloads[index];
    		Event evt = new Event(payload, sources[index]);
    		synchronized (listeners){
    			for (EventListener observer : this.listeners){
    			observer.notifyEvent(evt);
    			}
    		}
    		try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
}
