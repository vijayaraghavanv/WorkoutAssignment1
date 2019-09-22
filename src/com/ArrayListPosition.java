package com;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to print all the elements of a ArrayList using the position of the elements?
public class ArrayListPosition {

	public static void main(String[] args) {		
		rainbows();
	}
	
	public static void rainbows() {
		List<String> rainbow = new ArrayList<String>();
		rainbow.add("Violet");
		rainbow.add("Indigo");
		rainbow.add("Blue");
		rainbow.add("Green");
		rainbow.add("Yellow");
		rainbow.add("Orange");
		rainbow.add("Red");
		System.out.println("\nRainbow colours: " + rainbow);
		  int n = rainbow.size();
		  for (int i = 0; i < n; i++)
		   System.out.println("Rainbow colors::::"+rainbow.get(i));
		 }
}
