package com.java_peoject;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		double first =sc.nextDouble();
		double second =sc.nextDouble();
	    System.out.print("Enter an operator (+, -, *, /,%): ");
char operator=sc.next().charAt(0);
double result=0.0;

		
		switch (operator) {
		case '+':
		result=first+second;
		System.out.println(result);
			break;
			
		case '-':
			result=first-second;
			System.out.println(result);
				break;

		case '*':
			result=first*second;
			System.out.println(result);
				break;

		case '%':
			result=first%second;
			System.out.println(result);
				break;
				
		case '/':
			result=first/second;
			System.out.println(result);
				break;
		default:
			System.out.println("opreator is not correct");
		}


	}

}
