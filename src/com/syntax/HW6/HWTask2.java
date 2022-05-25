package com.syntax.HW6;

import java.util.Scanner;

public class HWTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.println("Choose an operator: +, -, *, or /");
		     char operator = input.next().charAt(0);
		    System.out.println("Enter first number");
		    int number1 = input.nextInt();

		    System.out.println("Enter second number");
		    int number2 = input.nextInt();

		    int result;
			switch (operator) {
		    case '+':
		        result = number1 + number2;
		        System.out.println(number1 + " + " + number2 + " = " + result);
		        break;

		     
		      case '-':
		        result = number1 - number2;
		        System.out.println(number1 + " - " + number2 + " = " + result);
		        break;

		      
		      case '*':
		        result = number1 * number2;
		        System.out.println(number1 + " * " + number2 + " = " + result);
		        break;

		      
		      case '/':
		        result = number1 / number2;
		        System.out.println(number1 + " / " + number2 + " = " + result);
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }

		    input.close();
		  }
		
		
		
		
		
		
		
		
		
		
		
	}


