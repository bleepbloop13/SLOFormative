package slo.controller;

public class SloController
{
	
	public String log;
	
	public void start()
	{
		log = "Falco";
		
		System.out.println("The length of the string 'log' is " + logLength() + " characters long.");
		
		if(log.length() == 3)
		{
			System.out.println("That ain't Falco");
		}
		else
		{
			System.out.println("Welcome to the year 20XX.");
		}
	
		intCompare();
	}
	
	private int logLength()
	{
		if(log.length() == 5)
		{
			String log = ("Fox");
			return log.length();
		}
		else
		{
			String log = ("Falco");
			return log.length();
		}
	}
	
	
	public void intCompare()
	{
		int leffinLossRate = 0;
		int m2kWinRate = 0;
		
		while(leffinLossRate < 10)
		{
			System.out.println("Leffin has lost to M2K " + leffinLossRate + " times.");
			leffinLossRate++;
			m2kWinRate++;
			m2kWinRate++;
		}
		
		
		if(m2kWinRate > leffinLossRate)
		{
			System.out.println("The King of Mewtwos is BACK!");
		}
		else
		{
			System.out.println("Leffin is not a scrub?");
		}
	
		doubleCompare();
	}

	public void doubleCompare()
	{
		double mang0Salt = 1.0;
		double drPeePeeWinRate = 0.5;
		
		while(drPeePeeWinRate <= 3)
		{
			System.out.println("PPMD's winrate is currently " + drPeePeeWinRate +
					", while Mang0's saltiness meter is " + mang0Salt + " percent full");
			drPeePeeWinRate++;
			mang0Salt++;
			mang0Salt++;
			mang0Salt++;
			mang0Salt++;
			mang0Salt++;
			mang0Salt++;
			mang0Salt++;
			mang0Salt++;
			mang0Salt++;
			mang0Salt++;
			mang0Salt++;
			mang0Salt++;
		}
		
		if(mang0Salt == 37)
		{
			System.out.println("Mang0's saltiness correlates to PPMD's winrate.");
		}
		else
		{
			System.out.println("Maybe Mang0 isn't all that salty?");
		}
	}

}


