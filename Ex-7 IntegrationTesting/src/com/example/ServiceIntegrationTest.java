package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ServiceIntegrationTest {
	private ServiceA serviceA;
	 private ServiceB serviceB;
	 @Before
	 public void setUp() {
	 // Initialize services
	 serviceA = new ServiceA();
	 serviceB = new ServiceB(serviceA); // ServiceB depends on ServiceA
	 }
	 @Test
	 public void testServiceIntegration() {
	 // Arrange
	 String input = "test input";
	 String expectedOutput = "Processed: test input and enhanced by ServiceB";
	 // Act
	 String actualOutput = serviceB.process(input);
	 // Assert
	 assertEquals(expectedOutput, actualOutput);
	 }


}
