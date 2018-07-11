package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		
		double actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue,0.00001);
	}
	
	@Test
	public void testSub() {
		Calculator calc = new Calculator();
	
		double actualValue = calc.sub(4,2);
		Assert.assertEquals(2,actualValue,0.00001);
	}
	
	@Test
	public void testMultiply() {
		
		Calculator calc = new Calculator();
		
		double actualValue = calc.multi(4,2);
		Assert.assertEquals(8,actualValue,0.00001);
	}
	
	
	
}
