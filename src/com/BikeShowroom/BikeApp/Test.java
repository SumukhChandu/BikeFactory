package com.BikeShowroom.BikeApp;

import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the bike ");
		String in=sc.next();
		Bike b=BikeShowroom.getBike(in);
		if(b!=null)
		{
			b.Start();
			b.Stop();
		}
		
		
	}
}
