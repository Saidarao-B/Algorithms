package concatenationOfArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatenationOfArrayTest {

	ConcatenationOfArray concat = new ConcatenationOfArray();
	
	@Test
	public void test1() {
		assertArrayEquals(new int[] {1,2,1,1,2,1}, concat.getConcatenation(new int[] {1,2,1}));
	}
	
	@Test
	public void test2() {
		assertArrayEquals(new int[] {1,3,2,1,1,3,2,1}, concat.getConcatenation(new int[] {1,3,2,1}));
	}
	
	@Test
	public void test3() {
		assertArrayEquals(new int[] {1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1}, concat.getConcatenation(new int[] {1,3,2,1,1,3,2,1}));
	}
	
	@Test
	public void test4() {
		assertArrayEquals(new int[] {1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1}, concat.getConcatenation(new int[] {1,3,2,1,1,3,2,1,1,3,2,1,1,3,2,1}));
	}

}
