package com;

import java.util.LinkedList;

//Write a Java program to join two linked lists?
public class LinkedListJoin {

	public static void main(String[] args) {
		LinkedList<String> automobiles=new LinkedList<String>(); 
		automobiles.add("BMW");
		automobiles.add("FORD");
		automobiles.add("HYUNDAI");
		automobiles.add("RENAULT");
		automobiles.add("MARUTHI");
		LinkedList<String> vehicles=new LinkedList<String>(); 
		vehicles.add("MAHINDRA");
		vehicles.add("HONDA");
		vehicles.addAll(2, automobiles);
		System.out.println("After joining all motorcycles::"+vehicles);
		for (int i = 0; i < vehicles.size(); i++) {
			System.out.println("Index position::"+i+" "+"vehicle name::"+vehicles.get(i));
		}
	}

}
