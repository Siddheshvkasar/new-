package com.loops;

import java.util.Scanner;

public class NumTableFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the Number=");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int count = 1;count<=10;count++) {
			System.out.println(+count*num);
		}

	}

}
