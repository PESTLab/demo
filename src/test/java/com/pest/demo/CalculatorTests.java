package com.pest.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTests {

	Calculator calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	@Test
	public void testAdd() {
		assertEquals(5, calc.add(2, 3));
	}
	

}
