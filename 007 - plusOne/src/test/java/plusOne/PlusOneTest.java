package plusOne;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlusOneTest {

	PlusOne p = new PlusOne();
	
	
	@Test
	public void test1() {
		assertArrayEquals(new int[]{1,2,3},p.plusOne(new int[] {1,2,2}));
	}
	
	@Test
	public void test2() {
		assertArrayEquals(new int[]{5,2,2,6,5,7,1,9,0,3,8,6,8,6,5,2,1,8,7,9,8,3,8,4,7,2,5,9,0},p.plusOne(new int[] {5,2,2,6,5,7,1,9,0,3,8,6,8,6,5,2,1,8,7,9,8,3,8,4,7,2,5,8,9}));
	}
	
	@Test
	public void test3() {
		assertArrayEquals(new int[]{1,0},p.plusOne(new int[] {9}));
	}
	
	
	@Test
	public void test4() {
		assertArrayEquals(new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},p.plusOne(new int[] {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9}));
	}
	
	
	@Test
	public void test5() {
		assertArrayEquals(new int[]{1,8},p.plusOne(new int[] {1,7}));
	}
	
	@Test
	public void test6() {
		assertArrayEquals(new int[]{1},p.plusOne(new int[] {0}));
	}

}
