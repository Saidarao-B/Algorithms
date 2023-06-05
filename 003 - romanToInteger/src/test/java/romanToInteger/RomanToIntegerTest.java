package romanToInteger;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToIntegerTest {
	RomanToInteger romanToInteger = new RomanToInteger();

	@Test
	public void test1() {
		assertEquals(3,romanToInteger.romanToInt("III"));
	}
	
	@Test
	public void test2() {
		assertEquals(58,romanToInteger.romanToInt("LVIII"));
	}
	
	@Test
	public void test3() {
		assertEquals(1994,romanToInteger.romanToInt("MCMXCIV"));
	}
	
	@Test
	public void test4() {
		assertEquals(994,romanToInteger.romanToInt("CMXCIV"));
	}

}
