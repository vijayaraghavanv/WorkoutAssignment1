package com;

//Print following structure in Java using Loop?
//*
//***
//*****
//***
//*

public class StarPattern {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i = i + 2) {
			//iterates the first three lines of pattern
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//iterates the last two lines of pattern
		for (int m = 2; m >= 0; m = m - 2) {
			for (int n = 0; n <= m; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
