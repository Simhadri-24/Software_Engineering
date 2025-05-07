package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
@Execution(ExecutionMode.CONCURRENT)
class ConcurrentTests
{
	@Test
	void test1() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Test 1 Completed");
		assertEquals(1,1);
	}
	@Test
	void test2() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Test 2 Completed");
		assertEquals(2,2);
	}
	@Test
	void test3() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Test 3 Completed");
		assertEquals(3,3);
	}
}