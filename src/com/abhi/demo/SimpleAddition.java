package com.abhi.demo;

public class SimpleAddition {

	private int firstNumber;
	private int secondNumber;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 100; i++) {
			SimpleAddition sa = new SimpleAddition(i, i);
			System.out.println("Addition of " + i + " + " + i + " is " + sa.add());
		}
		
	}

	
	public SimpleAddition(int one, int two) {

		this.firstNumber = one;
		this.secondNumber = two;
		
	}
	
	
	public int add() {
		int result = firstNumber + secondNumber;
		return result;
	}
	
	
}
