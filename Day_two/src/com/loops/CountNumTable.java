package com.loops;

import java.util.Scanner;

public class CountNumTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the number to print table=");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count = 1;
		
		while(count<=10) {
			System.out.println(a*count);
			count = count+1; // Count++
		}
		

	}

}
