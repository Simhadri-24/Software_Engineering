package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
public class CalculatorTest {
	private Calculator calculator;
	@BeforeEach
	void setUp()
	{
		calculator=new Calculator();
	}
	@Test
	void testAdd()
	{
		int result=calculator.add(5,3);
		Assertions.assertEquals(8,result);
	}
	@Test
	void testSubstract()
	{ 
		int result=calculator.sub(10,4);
		Assertions.assertEquals(6,result);
		}
	@Test
	void testMultiply()
	{
		int result=calculator.mul(2,5);
		Assertions.assertEquals(10,result);
	}

}
