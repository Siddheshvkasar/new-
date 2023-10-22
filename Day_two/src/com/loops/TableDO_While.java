package com.loops;

import java.util.Scanner;

public class TableDO_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the num=");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 1;
		 
		System.out.println("Table of given number =");
		do {
			
			System.out.println(num*count);
			count++;
		}
		while(count<=10);
			
		}

	}


