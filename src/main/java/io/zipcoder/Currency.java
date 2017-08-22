package io.zipcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Currency {
	// UserInput Fields
	private String currentCurrency;
	private String targetCurrency;
	private double amount;

	private double currentCurrencyRate1 = 0.00;
	private double currentCurrencyRate2 = 0.00;
	public Map<String, Double> currencies= new HashMap<>();

	public Currency() {
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

	}

    
    	public double convert(String inCurrency, String outCurrency, double amount) 
    	{
    		return (amount/currencies.get(inCurrency)) * currencies.get(outCurrency);
    		
    	
    	}
    
}
