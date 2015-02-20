package taxPersonTests;

import static org.junit.Assert.*;

import org.junit.Test;

import taxPerson.Item;

public class testTaxCalculation {

	@Test
	public void testLuxuryTaxCalculation() {
		Item item = new Item();
		double cost = 10.01;
		item.setCost(cost);
		item.setIsLuxury(true);
		double luxuryTaxRate = 1.09;
		double expectedValue = item.roundToPennies(cost * luxuryTaxRate);
		assertTrue(expectedValue == item.calculateCostAfterTax());
	}

	@Test
	public void testNecessityTaxCalculation(){
		Item item = new Item();
		double cost = 21.12;
		item.setCost(cost);
		item.setIsLuxury(false);
		double necessityTaxRate = 1.01;
		double expectedValue = item.roundToPennies(cost * necessityTaxRate);
		assertTrue(expectedValue == item.calculateCostAfterTax());
		
	}
}
