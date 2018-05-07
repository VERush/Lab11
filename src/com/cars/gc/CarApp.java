/*
 * Lab 11 Part 1 by Jiao Xu and Vicki Rush with help from Tim Pieniazek
 *   May 7, 2018
 */
package com.cars.gc;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		int carNum = 0;
		ArrayList<NewCar> inventory = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("How many cars are you entering: ");
		carNum = scan.nextInt();
		scan.nextLine();

		for (int i = 1; i <= carNum; i++) {
			NewCar thisCar = new NewCar();
			System.out.println("Enter Car #" + i + " Make: ");
			thisCar.setMake(scan.nextLine());
			System.out.println("Enter Car #" + i + " Model: ");
			thisCar.setModel(scan.nextLine());
			System.out.println("Enter Car #" + i + " Year: ");
			thisCar.setYear(scan.nextInt());
			System.out.println("Enter Car #" + i + " Price: ");
			thisCar.setPrice(scan.nextDouble());
			System.out.println();
			inventory.add(thisCar);
			scan.nextLine();
		}
		System.out.println("Current Inventory:");

		for (int i = 0; i < inventory.size(); i++) {
			System.out.println(inventory.get(i));
		}

		// System.out.println(inventory);
		scan.close();
	}
}
