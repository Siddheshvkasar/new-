package com.ConditionalStatement;

public class SwitchOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 101;
		switch (num%2) {
		
		case 0:System.out.println("The number is even");
		break;
		
		default :System.out.println("odd");
		break;
		}

	}

}
