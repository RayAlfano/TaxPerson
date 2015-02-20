package taxPersonTests;

import static org.junit.Assert.*;

import org.junit.Test;

import taxPerson.taxPersonMain;

public class testParseNumber {

	@Test
	public void testHundredthValueResolution() {
		assertTrue(-1.0 != taxPersonMain.parseCostInput("120.52"));
	}

	@Test
	public void testTenthValueResolution(){
		assertTrue(-1.0 != taxPersonMain.parseCostInput("130.1"));
	}
	
	@Test
	public void testIntegerInput(){
		assertTrue(-1.0 != taxPersonMain.parseCostInput("130"));
	}
	
	@Test
	public void testNegativeInputRejection(){
		assertTrue(-1.0 == taxPersonMain.parseCostInput("-12.04"));
	}
	
	@Test
	public void testBadInputRejection(){
		assertTrue(-1.0 == taxPersonMain.parseCostInput("hello"));
	}
	
	@Test
	public void testOutOfRangeValueResolution(){
		assertTrue(-1.0 == taxPersonMain.parseCostInput("1241.002342"));
	}
}
