package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quarters = 25, dimes = 10, nickels = 5, pennies = 1;
		int hundreds = 100, fifties = 50, twenties = 20, tens = 10, fives = 5, ones = 1;

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

		int changeDollars = (int) change;
		
		hundreds = changeDollars / 100;
		fifties = (changeDollars % 100) / 50;
		twenties = (changeDollars % 100 % 50) / 20;
		tens = (changeDollars % 100 & 50 % 20) / 10;
		fives = (changeDollars % 100 % 50 % 20 % 10) / 5;
		ones = (changeDollars % 100 % 50 % 20 % 10 % 5) / 1;
		
		double changeCoins1 = (change * 100.0) - (100 * changeDollars);
		int changeCoins = (int) changeCoins1;
		
		quarters = changeCoins / 25;
		dimes = (changeCoins % 25) / 10;
		nickels = (changeCoins % 25 % 10) /5;
		pennies = (changeCoins % 25 % 10 % 5) /1;
		
		do {
			if (hundreds != 0) {
				System.out.println("Hundreds: " + hundreds);
				System.out.println();
			}
			if (fifties != 0) {
				System.out.println("Fifties: " + fifties);
				System.out.println();
			}
			if (twenties != 0) {
				System.out.println("Twenties: " + twenties);
				System.out.println();
			}
			if (tens != 0) {
				System.out.println("Tens: " + tens);
				System.out.println();
			}
			if (fives != 0) {
				System.out.println("Fives: " + fives);
				System.out.println();
			}
			if (ones != 0) {
				System.out.println("Ones: ");
				System.out.println();
			}
			if ()
		}
		

		System.out.println(changeDollars);
		System.out.println(changeCoins);
		
		System.out.println("Hundreds: " + hundreds + "\nFifties: " + fifties + "\nTwenties: " + twenties + "\nTens: " + tens + "\nFives: " + fives + "\nOnes: " + ones);
		System.out.println("Quarters: " + quarters + "\nDimes: " + dimes + "\nNickels: " + nickels + "\nPennies: " + pennies);
		
		

		sc.close();
	}
}

