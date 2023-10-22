package com.ConditionalStatement;

public class ToCheck_Char_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char alpha = '@';

		
		if (alpha >='a' && alpha <= 'z') {
			System.out.println("The given input is character !");
		}
		
		else if (alpha >= '0' && alpha <= '9') {
			System.out.println("The given input is Number");
		}
		else {
			System.out.println("The given input is Not char or number or might be symbol");
		}
		
		

	}

}
