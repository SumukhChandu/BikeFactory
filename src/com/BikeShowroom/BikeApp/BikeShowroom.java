package com.BikeShowroom.BikeApp;

public class BikeShowroom {
 public static Bike getBike(String in)
 {
	 if(in.equalsIgnoreCase("Jawa"))
	 {
		 return new Jawa();

	 }
	 else
	 {
		 System.out.println("the bike is not available");
		 return null;
	 }
	 
 }
}
