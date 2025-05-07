package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	Calculator calc=new Calculator();
	@Test
	public void testAdd()
	{
		int res=calc.add(5, 3);
		assertEquals(8,res);
	}
	public void testsub()
	{
		int res=calc.sub(5,3);
		assertEquals(2,res);
	}
	public void testMul()
	{
		int res=calc.mul(5,3);
		assertEquals(15,res);
	}


}
