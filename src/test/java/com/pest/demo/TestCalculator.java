package com.pest.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	Calculator calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	@Test
	public void testAddPositiveNumbers() {
		assertEquals(5, calc.add(2, 3));
	}
	
	@Test
	public void testAddNegativeNumbers() {
		assertEquals(-5, calc.add(-2, -3));
	}
	

}