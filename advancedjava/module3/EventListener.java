package com.edureka.advancedjava.module3;

// Specify different listener to listen to different event
// It should be interface, because the specified listener is not known.
public interface EventListener {
    public void notifyEvent(Event event); // the status of event should be defined in event
    
    
}
