package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quarters, dimes, nickels, pennies;
		int hundreds, fifties, twenties, tens, fives, ones;

		System.out.print("Please tell me the asking price of the item: \t");
		double askingPrice = sc.nextDouble();
		System.out.print("How much money was tendered for the item?   \t");
		double amountTendered = sc.nextDouble();

		if (askingPrice > amountTendered) {
			System.err.println("You have underpaid and money is still owed.");
		} else if (askingPrice == amountTendered) {
			System.out.println("The amount recieved is the exact amount necessary.");
		}
		
		double changeInitial = amountTendered - askingPrice;
		double change = Math.round(changeInitial * 100.0) / 100.0;

		System.out.println("Your change due is : " + change);

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
		
			if (hundreds != 0) {
				System.out.println("Hundreds: " + hundreds);
			}
			if (fifties != 0) {
				System.out.println("Fifties: " + fifties);
			}
			if (twenties != 0) {
				System.out.println("Twenties: " + twenties);
			}
			if (tens != 0) {
				System.out.println("Tens: " + tens);
			}
			if (fives != 0) {
				System.out.println("Fives: " + fives);
			}
			if (ones != 0) {
				System.out.println("Ones: " + ones);
			}
			if (quarters != 0) {
				System.out.println("Quarters: " + quarters);
			}
			if (dimes != 0) {
				System.out.println("Dimes: " + dimes);
			}
			if (nickels != 0) {
				System.out.println("Nickels: " + nickels);
			}
			if (pennies != 0) {
				System.out.println("Pennies: " + pennies);
			}
			
		sc.close();
	}
}

