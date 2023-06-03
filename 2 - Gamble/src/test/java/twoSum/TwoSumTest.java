package twoSum;

import static org.junit.Assert.*;

import org.junit.Test;



public class TwoSumTest {
	TwoSum ts = new TwoSum();

	@Test
	public void test1() {
		assertArrayEquals(new int[] {0,4}, ts.twoSum(new int[] {2,7,11,15,18}, 20));
	}
	
	@Test
	public void test2() {
		assertArrayEquals(new int[] {1,3}, ts.twoSum(new int[] {1,3,2,4}, 7));
	}
	
	@Test
	public void test3() {
		assertArrayEquals(new int[] {0,1}, ts.twoSum(new int[] {3,3}, 6));
	}

}
