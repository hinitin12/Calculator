package com.test;

import java.util.Scanner;

public class CalculatorTest {

	
	public int add(String data) {
		int sum=0;
		System.out.println(data);
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		CalculatorTest test = new CalculatorTest();
		Scanner sc = new Scanner(System.in);
		int input = test.add(sc.next());
		System.out.println(input);
	}

}
