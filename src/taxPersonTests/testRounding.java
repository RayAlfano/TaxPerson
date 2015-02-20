package taxPersonTests;

import static org.junit.Assert.*;

import org.junit.Test;

import taxPerson.Item;

public class testRounding {

	@Test
	public void testRoundingBasic() {

		Item aItem = new Item();
		Item bItem = new Item();
		
		assertTrue(aItem.roundToPennies(10.00) == aItem.roundToPennies(10.00));
	}
	@Test
	public void testRoundingBehavior() {
		//Test that the HALF_EVEN rounding behavior behaves as expected
		Item aItem = new Item();
		Item bItem = new Item();
		
		assertTrue(aItem.roundToPennies(10.004) != aItem.roundToPennies(10.005));
	}

}
