package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;


public class CurrencyConverterTest {
	
	
	@Test
	public void convertTest(){
		
		Currency c = new Currency();
		
		//Not testing this method to two decimal places, instead I will have this casting in my main method in CurrencyConverter2
		double expected= 4238.04;
				
		double actual= c.convert("British Pound", "Japanese Yen", 30.00);
		
		
		Assert.assertEquals(expected, actual, 0.01);
	}
}