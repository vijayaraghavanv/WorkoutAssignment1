package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Write a Java program to get the value of a specified key in a map
public class HashMapspecifiedKey {

	public static void main(String[] args) {
		Map<Integer, String> countries = new HashMap<Integer,String>();
		countries.put(1, "USA");
		countries.put(2, "China");
		countries.put(3, "UK");
		countries.put(4, "India");
		countries.put(5, "Germany");
		System.out.println("select integer index for country to be retrieved below::");
		Scanner scan = new Scanner(System.in);
		int key = scan.nextInt();
		System.out.println(countries.get(key));
		scan.close();
	}

}
