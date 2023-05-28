package car_Parking_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Parking_System {
	
	static int totalSlots, availableSlots;
	static ArrayList<String> ParkedCars=new ArrayList<String>();
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the total number of parking slots");
		totalSlots=scanner.nextInt();
		availableSlots=totalSlots;
		
		while(true)
		{
			System.out.println("/nChoose a relevant option");
			System.out.println("/1. Park car");
			System.out.println("/2. Remove car");
			System.out.println("/3. View parked cars");
			System.out.println("/4. Exit");
			System.out.println("Enter Your choice");
			int choice=scanner.nextInt();
			
			switch (choice) {
			case 1:
				parkCar();
				break;
			case 2:
				removeCar();
				break;
			case 3:
				viewparkedcars();
				break;
			case 4:
				System.exit(0);
				break;
		
			}
		}
	}
	
	public static void parkCar()
	{
		if(availableSlots==0)
		{
			System.out.println("Sorry, parking slots not available");
			return;
		}
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the registered car number");
		String registeredNumber=scanner.nextLine();
		ParkedCars.add(registeredNumber);
		availableSlots--;
		System.out.println("Car parked successfully. Available slots "+availableSlots);
	}
	
	public static void removeCar()
	{
		if(availableSlots==totalSlots)
		{
			System.out.println("No parked cars available");
			return;
		}
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the registered car number to remove");
		String registeredNumber=scanner.nextLine();
		if(ParkedCars.contains(registeredNumber))
		{
			ParkedCars.remove(registeredNumber);
			availableSlots++;
			System.out.println("Car removed successfully. Available slots "+availableSlots);
		}
		else{
			System.out.println("Car is not parked here");
		}
	}
	
	public static void viewparkedcars()
	{
		if(availableSlots==totalSlots)
		{
			System.out.println("There are no parked cars");
			return;
		}
		
		System.out.println("Parked cars");
		for(String registeredNumber : ParkedCars)
		{
			System.out.println("Total number of parked cars "+registeredNumber);
		}
	}

}
