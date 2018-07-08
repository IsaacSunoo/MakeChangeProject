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
		
		if (change > 0) {
		System.out.println("Your change due is : " + change);
		}

		int changeDollars = (int) change;
		
		hundreds = changeDollars / 100;
		fifties = (changeDollars % 100) / 50;
		twenties = (changeDollars % 100 % 50) / 20;
		tens = (changeDollars % 100 % 50 % 20) / 10;
		fives = (changeDollars % 100 % 50 % 20 % 10) / 5;
		ones = (changeDollars % 100 % 50 % 20 % 10 % 5) / 1;
		
		double changeCoins1 = (change * 100.0) - (100 * changeDollars);
		int changeCoins = (int) changeCoins1;
		
		quarters = changeCoins / 25;
		dimes = (changeCoins % 25) / 10;
		nickels = (changeCoins % 25 % 10) /5;
		pennies = (changeCoins % 25 % 10 % 5) /1;
		
			if (hundreds == 1 && hundreds > 0) {
				System.out.println(hundreds + " hundred dollar bill");
			}
			else if (hundreds > 1) {
				System.out.println(hundreds + " hundred dollar bills");
			}
			if (fifties == 1 && fifties > 0) {
				System.out.println(fifties + " fifty dollar bill");
			}
			else if (fifties >  1) {
				System.out.println(fifties + " fifty dollar bills");
			}
			if (twenties == 1 && twenties > 0) {
				System.out.println(twenties + " twenty dollar bill");
			}
			else if (twenties > 1) {
				System.out.println(twenties + " twenty dollar bills");
			}
			if (tens == 1 && tens > 0) {
				System.out.println(tens + " ten dollar bill");
			}
			else if (tens > 1) {
				System.out.println(tens + " ten dollar bills");
			}
			if (fives == 1 && fives > 0) {
				System.out.println(fives + " five dollar bill");
			}
			else if (fives > 1) {
				System.out.println(fives + " five dollar bills");
			}
			if (ones == 1 && ones > 0) {
				System.out.println(ones + " one dollar bill");
			}
			else if (ones > 1) {
				System.out.println(ones + " one dollar bills");
			}
			if (quarters == 1 && quarters > 0) {
				System.out.println(quarters + " quarter");
			}
			else if (quarters > 1) {
				System.out.println(quarters + " quarters");
			}
			if (dimes == 1 && dimes > 0) {
				System.out.println(dimes + " dime");
			}
			else if (dimes > 1) {
				System.out.println(dimes + " dimes");
			}
			if (nickels == 1 && nickels > 0) {
				System.out.println(nickels + " nickels");
			}
			else if (nickels > 1) {
				System.out.println(nickels + " nickels");
			}
			if (pennies == 1 && pennies > 0) {
				System.out.println(pennies + " penny.");
			}
			else if (pennies > 1) {
				System.out.println(pennies + " pennies.");
			}
		sc.close();
	}
}
