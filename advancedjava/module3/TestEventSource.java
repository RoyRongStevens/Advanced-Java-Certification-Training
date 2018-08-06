package com.edureka.advancedjava.module3;

import java.util.ArrayList;

public final class TestEventSource 
{
    private static final int ITERATIONS = 10;
    
    private TestEventListener evlistener = null;
    
    public void registerListener(TestEventListener listener)
    {
    	 evlistener = listener;
    }
    
    public void notifyListener(TestEvent evObj)
    {
    	evlistener.eventHandler(evObj);
    }
    
    public static void main(String[] args)
    {
    	TestEventSource evSource = new TestEventSource();
    	evSource.registerListener(new TestEventConsumer());
    	
    	for (int i = 0; i < ITERATIONS; i++)
    	{
    		TestEvent ev = new TestEvent("Test Msg: " + (i + 1), evSource);
    		evSource.notifyListener(ev);
    	}
    }
}


// class modeling the event

class TestEvent
{
	protected String payload;
	
	protected Object evSource;
	
	public TestEvent(String payload, Object evSource)
	{
		this.payload = payload;
		this.evSource = evSource;
	}
	
	public String getPayload()
	{
		return payload;
	}
	
	public String toString()
	{
		return evSource.getClass().getSimpleName();
	}
}

// Interface that the event consumers should implement

interface TestEventListener
{
	public void eventHandler(TestEvent evObj);
}

// The event consumer realizing the TestEventListener interface

class TestEventConsumer implements TestEventListener
{
	public void eventHandler(TestEvent evObj)
	{
		System.out.println("Source: " + evObj.toString() + " " + "Payload: " + evObj.getPayload());
	}
}

















