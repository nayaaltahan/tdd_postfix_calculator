package tdd_postfix_calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private static final double DELTA = 0.0001;
	private Calculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringOneIsDoubleOne() {
		double actual = calculator.calculate("1");
		
		assertEquals(1, actual, DELTA);
	}
	
	@Test
	public void testStringTwoIsDoubleTwo() {
		double actual = calculator.calculate("2");
		
		assertEquals(2, actual, DELTA);
	}
	
	@Test
	public void testStringZeroIsDoubleZero() {
		double actual = calculator.calculate("0");
		
		assertEquals(0, actual, DELTA);
	}
	
	@Test
	public void testString100IsDouble100() {
		double actual = calculator.calculate("100");
		
		assertEquals(100, actual, DELTA);
	}
	
	
	
	@Test
	public void testOnePlusOneIsDoubleTwo() {
		double actual = calculator.calculate("1 1 +");
		
		assertEquals(2, actual, DELTA);
	}
	
	@Test
	public void testOnePlusOnePlusOneIsDouble3() {
		double actual = calculator.calculate("1 1 1 + +");
		
		assertEquals(3, actual, DELTA);
	}
	
	@Test
	public void testOnePlusOnePlusOneIsDouble3WhilePlusIsThird() {
		double actual = calculator.calculate("1 1 + 1 +");
		
		assertEquals(3, actual, DELTA);
	}

}
