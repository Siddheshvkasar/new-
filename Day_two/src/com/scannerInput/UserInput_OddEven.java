package com.scannerInput;

import java.util.Scanner;

public class UserInput_OddEven {

	public static void main(String[] args) {
		int num;
		
		System.out.println("enter The number to check even or odd = ");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num % 2==0) {
			System.out.println("The number is even ");
		}
		
		else {
			System.out.println("The number is odd");
		}

	}

}
