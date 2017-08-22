package io.zipcoder;

import java.util.Scanner;

public class CurrencyConverter2 {
	
	public static void main(String[] args) {
		
		Currency currencies = new Currency();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What currency do you have?");
		String inCurrency = sc.nextLine();
		System.out.println("What currency do you have?");
		double amount = sc.nextDouble();
		System.out.println("What currency do you want to convert to?");
		String outCurrency = sc.nextLine();
		
		
		double result = currencies.convert(inCurrency, outCurrency, amount);
		//Give result in two decimal places
		System.out.println(String.format("%.2d", result));
		
	}

}
