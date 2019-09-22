package com;

import java.util.LinkedList;

// Write a Java program to insert the specified element at the specified position in the linked list
public class LinkedlistPosition {

	public static void main(String[] args) {
		LinkedList<String> weekdays=new LinkedList<String>(); 
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Saturday");
		weekdays.add("Sunday");		
		System.out.println("original list::"+weekdays);
		weekdays.add(4, "Friday");
		System.out.println("Revised list::"+weekdays);
	}

}
