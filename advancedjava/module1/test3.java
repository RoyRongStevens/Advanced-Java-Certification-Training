package com.edureka.advancedjava.module1;

import java.util.Scanner;

public class test3

{

	public static void main(String[] args) {
		boolean quit = false;
		int sum = 0;
		int wine = 200, cold = 20, bear = 400, juice = 100;
		String order = "";
		int i;

		Scanner input = new Scanner(System.in);

		// title
		System.out.println(" Welcome to the Drinkinghouse");

		// ask how many people in group
		System.out.println("How many people are in your group: ");
		int numDiner = input.nextInt();

		// size an array of type String now this will store
		// all the names of the people who are here to eat

		String dinerNameArray[] = new String[numDiner];

		System.out.println("Now each person can order from the list given below");
		input.nextLine();

		do {
			System.out.println("ITEM" + "\t\tPrice");
			System.out.println("1.Wine" + "\t\t" + "200");
			System.out.println("2.ColdDrink" + "\t" + "20");
			System.out.println("3.Bear" + "\t\t" + "400");
			System.out.println("4.Juice" + "\t\t" + "100");
			System.out.println("5.Quit");

			int choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Wine" + "\n");
				sum = sum + wine;
				order = order.concat("wine" + "\n");

				break;
			case 2:
				System.out.println("ColdDrink");
				sum = sum + cold;
				order = order.concat("ColdDrink" + "\n");

				break;
			case 3:
				System.out.println("Bear");
				sum = sum + bear;
				order = order.concat("Bear" + "\n");
				break;
			case 4:
				System.out.println("Juice");
				sum = sum + juice;
				order = order.concat("Juice" + "\n");
				break;
			case 5:
				quit = true;

				break;
			default:
				System.out.println("Wrong input");
			}

		} while (!quit);

		System.out.println(" Your Orders:\n" + order);
		System.out.println("Your total bill=" + sum);

		System.out.println("Thank you");

	}// end for
}
// end main

