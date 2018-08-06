package com.edureka.advancedjava.module1;

import java.util.Scanner;

public class test1 // Here is short example we are using phone so
// we have functions like dial,receive and messaging so in that way we can implement

{
	void dial() {

		System.out.println("You can dial any number and can speak with the person on call");

	}

	void receive() {

		System.out.println("Please use this function to receive the call ");

	}

	String message(String s) {
		return s;
	}

	public static void main(String[] args)

	{
		String text;
		Scanner sc = new Scanner(System.in);
		test1 obj = new test1();
		obj.dial();
		obj.receive();
		text = obj.message("Hey Iam sending a message");
		System.out.println(text);

	}
}