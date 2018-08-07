package com.edureka.advancedjava.module3;

// the status of event should be defined in Event and invoked in EventListener
public class Event {
    private String payload; // actual data
    private String source; // header 
    
    public Event(String payload, String source){
    	this.payload = payload;
    	this.source = source;
    }

	public String getPayload() {
		return payload;
	}

	public String getSource() {
		return source;
	}
}
