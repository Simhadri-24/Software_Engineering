package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorParametrizedTest {
	private Calculator calc=new Calculator();
	@ParameterizedTest
	@CsvSource({
		"1,1,2",
		"2,3,5",
		"3,7,10"
	})
	void testAdd(int a,int b,int expected)
	{
		assertEquals(expected,calc.add(a, b));
	}
}


