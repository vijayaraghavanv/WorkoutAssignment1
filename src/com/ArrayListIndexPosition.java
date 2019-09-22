package com;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to retrieve an element (at a specified index) from a given array list?
public class ArrayListIndexPosition {

	public static void main(String[] args) {

		flowerList(5);

	}

	
	public static void flowerList(int n) {
		List<String> cars = new ArrayList<String>();
		cars.add("Maruthi");
		cars.add("Honda");
		cars.add("Hyundai");
		cars.add("Renault");
		cars.add("Ria");
		cars.add("Benz");
		try 
		{
			//checking car list is empty and index position less than arraylist size
			if (!cars.isEmpty() && n<=cars.size()){
			System.out.println(cars.get(n));
			}
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Enter number less than its size=>" + cars.size());
		}

		//check car list is empty
		if(!cars.isEmpty())
		{
			for (String string : cars) {
				System.out.println("car availables are=>" +string);
			}
		} else {
			System.out.println("Oops! the car list is empty");
		}
		
	}
}
