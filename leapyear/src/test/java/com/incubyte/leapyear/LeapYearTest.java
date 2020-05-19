package com.incubyte.leapyear;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class LeapYearTest {
	
	LeapYearCalculator calc = new LeapYearCalculator();
	
	@Test
	public void testFirstCriteria()
	{
		assertEquals("first criteria : All years Divisible by 400 ARE leap year", true, calc.firstCriteria(400) );
	}
		
	@Test
	public void testSecondCriteria()
	{
		assertEquals("second criteria : All years Divisible by 100 but not by 400 are NOT leap years", true, calc.secondCriteria(1600) );
	}

}
