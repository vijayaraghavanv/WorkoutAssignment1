package com;

import java.util.LinkedList;

//Write a Java program to get the first and last occurrence of the specified elements in a linked list?
public class LinkedListOccurance {

	public static void main(String[] args) {
		LinkedList<String> laptop=new LinkedList<String>(); 
		laptop.add("HCL");
		laptop.add("hp");
		laptop.add("ASUS");
		laptop.add("Apple");
		laptop.add("Lenovo");
		laptop.add("HCL");
		//all laptops
		System.out.println("Laptops are::"+laptop);
		
		//first instance of HCL
		System.out.println("HCL first instance::"+laptop.indexOf("HCL"));
		
		//Last instance of HCL
		System.out.println("HCL last instance::"+laptop.lastIndexOf("HCL"));
		
		//No instance of DELL
		System.out.println("No Dell instance::"+laptop.lastIndexOf("DELL"));
	}

}
