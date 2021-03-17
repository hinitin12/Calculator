package com.test;

import java.util.Scanner;

public class CalculatorTest {

	public int add(String data) {
		int sum = 0;
		System.out.println(data);
		for (int i = 0; i < data.length(); i++) {
			try {
				if (data.charAt(i) == '-') {
					throw new NegativeNumberException("Negative Number Exception");
					// System.out.println("Negative Number Exception");
				} else {

					char temp = data.charAt(i);
					if (Character.isDigit(temp)) {
						int number = Integer.parseInt(String.valueOf(temp));
						sum = sum + number;

					}
				}
			} catch (NegativeNumberException ne) {
				ne.printStackTrace();
			}
		}
		return sum;
	}

	public static void main(String[] args) throws NegativeNumberException {
		CalculatorTest test = new CalculatorTest();
		Scanner sc = new Scanner(System.in);
		int input = test.add(sc.next());
		System.out.println("Addition : "+input);
	}

}

class NegativeNumberException extends Exception {

	public NegativeNumberException(String s) {
		super(s);
	}

}