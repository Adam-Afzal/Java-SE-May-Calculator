package com.qa.calculator;

public class Calculator {

	private AddNumbers ad = new AddNumbers();
	private SubNumbers sN = new SubNumbers();
	private MultiplyNumbers mN = new MultiplyNumbers();
	
	
	
	public double add(double num1, double num2) {
		double result = 0;
		result = this.ad.add(num1, num2);
		return result;
	}
	
	public double sub(double num1, double num2) {
		double result = 0;
		result = this.sN.sub(num1, num2);
		return result;
	}
	
	
	
	public double multi(double num1, double num2) {
		double result = 0;
		result = this.mN.multiply(num1, num2);
		return result;
	}
	
	
}
