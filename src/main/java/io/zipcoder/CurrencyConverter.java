package io.zipcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
	


		Map<String, Double> currencies = new HashMap<>();
		currencies.put("USD", 1.0);
		currencies.put("Euro", 0.78391);
		currencies.put("British Pound", 0.82);
		currencies.put("Indian Rupee", 68.32);
		currencies.put("Australian Dollar", 1.35);
		currencies.put("Canadian Dollar", 1.32);
		currencies.put("Singapore Dollar", 1.43);
		currencies.put("Swiss Franc", 1.01);
		currencies.put("Malaysian Ringgit", 4.47);
		currencies.put("Japanese Yen", 115.84);
		currencies.put("Chinese Yuan Renminbi", 6.92);

		
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("What currency do you have? \nUSD\nEuro\nBritish Pound\nIndian Rupee\nAustralian Dollar\nCanadian Dollar\nSingapore Dollar\nSwiss Franc\nMalaysian Ringgit\nJapanese Yen\nChinese Yuan Renminbi");
	String currentCurrency = scanner.next();
	scanner.nextLine();
	
	
	System.out.println("What currency would you like to exchange it to? \nUSD\nEuro\nBritish Pound\nIndian Rupee\nAustralian Dollar\nCanadian Dollar\nSingapore Dollar\nSwiss Franc\nMalaysian Ringgit\nJapanese Yen\nChinese Yuan Renminbi");
	String targetCurrency = scanner.nextLine();
	//scanner.nextLine();
	
	System.out.println("And how much would you like to convert? Please include two decimal places \ne.g £30 = £30.00");
	double amount = scanner.nextDouble();
	scanner.nextLine();
	
	double currentCurrencyRate1= 0.00;
	double currentCurrencyRate2= 0.00;
	
	if (currencies.containsKey(currentCurrency))
	{
		//get rate of that currency
		 currentCurrencyRate1 = currencies.get(currentCurrency);
	}
		
		else
		{
			System.out.println("Sorry you have typed in an invalid currency...");
		}
		
	
	if (currencies.containsKey(targetCurrency))
	{
		//get rate of that currency
		 currentCurrencyRate2 = currencies.get(targetCurrency);

	}
	else
	{
		System.out.println("Sorry you have typed in an invalid currency...");
	}
	
	
	if (currentCurrencyRate1 == 0.00 || currentCurrencyRate2 == 0.00)
	{
		System.out.print("Sorry we cannot convert your currency as you have entered an invalid currency");
	}
	else
	{
		//Convert currencyCurrency to USD;
		double currencyUSD = (amount/currentCurrencyRate1);
		//Convert currency to target currency
		double finalValue = (currencyUSD*currentCurrencyRate2);
		System.out.println(finalValue);
		
	}
	
}

}
