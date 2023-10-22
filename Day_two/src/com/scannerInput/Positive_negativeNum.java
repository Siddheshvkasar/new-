package com.scannerInput;

import java.util.Scanner;

public class Positive_negativeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		System.out.println("Enter the number to check positive or negative");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("The Number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
 
	}

}
