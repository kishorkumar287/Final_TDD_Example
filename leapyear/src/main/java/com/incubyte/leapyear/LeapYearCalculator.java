package com.incubyte.leapyear;

public class LeapYearCalculator {
	
	public boolean firstCriteria(int date)
	{
		if(date % 400 == 0)
			return true;
		
		return false;
	}
	
	

}
