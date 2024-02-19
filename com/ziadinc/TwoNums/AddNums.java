package com.ziadinc.TwoNums;
import java.util.Scanner;

public class AddNums{
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ask("Enter num1: ");
		String input1 = sc.next();
		if (input1.contains(".")) {
			double num1 = Double.parseDouble(input1);
			ask("Enter num2: ");
		    String input2 = sc.next();
			double num2 = Double.parseDouble(input2);
			double sum = num1 + num2;
			System.out.println(sum);
			
		}
		else {
			int num1 = Integer.parseInt(input1);
			ask("Enter num2: ");
			String input2 = sc.next();
			if (input2.contains(".")) {
				double num2 = Double.parseDouble(input2);
				double sum = num1 + num2;
				System.out.println(sum);
			
			}
			else {
				int num2 = Integer.parseInt(input2);
				int sum = num1 + num2;
				System.out.println(sum);
			}
		}
		
	}
	private static void ask(String question) {
		System.out.println(question);
	}
}