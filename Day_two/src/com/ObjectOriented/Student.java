package com.ObjectOriented;

import java.util.Scanner;

public class Student {
	
	int id ;
	int age;
	String name;
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name =");
		name = sc.nextLine();
		System.out.println("Enter id =");
		id = sc.nextInt();
		System.out.println("Enter age =");
		age = sc.nextInt();
		
	}
	
	public void display() {
		System.out.println("Student Id ="+id);
		System.out.println("Student Name ="+name);
		System.out.println("Student age ="+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.acceptData();
		s1.display();

	}

}
