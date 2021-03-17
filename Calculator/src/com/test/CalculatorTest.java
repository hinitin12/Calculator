package com.test;

import java.util.Scanner;

public class CalculatorTest {

	public int add(String data) {
		int sum = 0;
		System.out.println(data);
		for(int i=0; i<data.length();i++) {
			char temp = data.charAt(i);
			if(Character.isDigit(temp)) {
				int number = Integer.parseInt(String.valueOf(temp));
				sum = sum + number;
				
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		CalculatorTest test = new CalculatorTest();
		Scanner sc = new Scanner(System.in);
		int input = test.add(sc.next());
		System.out.println(input);
	}

}
