package com.edureka.advancedjava.module3;

public class EventDemo {
    public static void main(String[] args){
    	EventSource source = new EventSource();
    	source.start();
    	
    	EventListener numberfoundlistener = new Numberfoundlistener();
    	source.registerListener(numberfoundlistener);
    	
    }
}

class Numberfoundlistener implements EventListener{
	
	public void notifyEvent(Event event){
		if(event.getSource() != null && event.getSource().equals("Mouse")){
			System.out.println("Inside MouseListener:::--->" + event.getPayload());
		}
	}
}

class GenericListener implements EventListener{
	public void notifyEvent(Event event){
		System.out.println("Inside Generic:::--->" + event.getPayload());
	}
}