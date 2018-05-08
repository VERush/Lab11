/*
 * Lab 11 Part 1 by Jiao Xu and Vicki Rush with help from Tim Pieniazek
 *   May 7, 2018
 */
package com.cars.gc;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		int menu = 0;
		int quit;
		String cont = "y";
		String buyYN;
		ArrayList<NewCar> inventory = new ArrayList<>();
		inventory.add(new NewCar("Chevrolet", "Malibu", 2012, 12000.00));
		inventory.add(new NewCar("Honda", "Odyssey", 2015, 35000.00));
		inventory.add(new NewCar("Lexus", "SC150", 2013, 45000.00));
		inventory.add(new UsedCar("Ford", "Focus", 2010, 8000.00, 12075.34));
		inventory.add(new UsedCar("Nissan", "Maxima", 2008, 6500.00, 35056.02));
		inventory.add(new UsedCar("Pontiac", "Skylark", 1999, 4000.00, 52015.78));

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus Motors!");

		System.out.println("Here is our Current Inventory:");

		while (cont == "y") {

			for (int i = 0; i < inventory.size(); i++) {
				menu = i + 1;
				System.out.print(menu + ". ");
				System.out.println(inventory.get(i));
			}
			quit = menu + 1;
			System.out.println(quit + ". Quit");
			System.out.println("Which car would you like? ");
			menu = scan.nextInt();
			scan.nextLine();
			if (menu == quit) {
				System.out.println("Have a great day!");
				cont = "";
			} else {
				System.out.println(inventory.get(menu - 1));
				System.out.println("Would you like to buy this car? ");
				buyYN = scan.nextLine();
				if (buyYN.equalsIgnoreCase("y")) {
					inventory.remove(menu - 1);
					System.out.println("Excellent! Our finance department will be in touch shortly.");
				}
			}
		}

		// System.out.println(inventory);
		scan.close();
	}
}
