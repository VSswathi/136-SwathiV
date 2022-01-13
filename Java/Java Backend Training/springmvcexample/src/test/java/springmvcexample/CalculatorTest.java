package springmvcexample;

import static org.junit.Assert.*;

import org.junit.Test;

import springmvcexample.utility.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		assertTrue(c.add(2, 3)==15);
	}
	@Test
	public void testSub() {
		Calculator c=new Calculator();
		assertTrue(c.sub(5, 3)==2);	
	}

}
