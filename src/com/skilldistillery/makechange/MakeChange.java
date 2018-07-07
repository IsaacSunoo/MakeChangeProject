package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quarters = 25, dimes = 10, nickels = 5, pennies = 1;
		int hundred = 100, fifty = 50, twenty = 20, ten = 10, five = 5, one = 1;

		System.out.print("Please tell me the asking price of the item: \t");
		double askingPrice = sc.nextDouble();
		System.out.print("How much money was tendered for the item?   \t");
		double amountTendered = sc.nextDouble();

		if (askingPrice > amountTendered) {
			System.out.println("You have underpaid and money is still owed.");
		} else if (askingPrice == amountTendered) {
			System.out.println("The amount recieved is the exact amount necessary.");
		}
		double changeInitial = amountTendered - askingPrice;

		double change = Math.round(changeInitial * 100.0) / 100.0;

		System.out.println("Your change due is : " + change);
		System.out.println(changeInitial);
		
			int changeDollars = (int)change;
			hundred = changeDollars / 100;
			fifty = (changeDollars % 100) /50;
			twenty = (changeDollars % 100 % 50) /20;
			ten = (changeDollars % 100 & 50 % 20) /10;
			five = (changeDollars % 100 % 50 % 20 % 10) /5;
			one = (changeDollars % 100 % 50 % 20 % 10 % 5) /1;
			int changeCoins = ((int)change * 100 - 100)/changeDollars;
			
			System.out.println(changeDollars);
			System.out.println(changeCoins);
			

		sc.close();
	}

	public static void calculateChange() {

	}

	public static double quarters = .25;
	public static double dimes = .10;
	public static double nickels = .05;
	public double pennies = .01;

	public static double quarters(double change) {
		return change / .25;
	}

	public static double dimes(double change) {
		return (change - quarters(change) * .25) / .10;
	}

	public static double nickels(double change) {
		return (change - (quarters * (change) * .25) - dimes * (change) * .10 / .05);
	}

	public static double pennies(double change) {
		return ((quarters * change * .25) - (dimes * change * .10) - (nickels * change * .05));
	}
}
