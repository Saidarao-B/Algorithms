package buildArrayFromPermutation;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuildArrayFromPermutationTest {

	BuildArrayFromPermutation BuildArray = new BuildArrayFromPermutation();

	@Test
	public void test1() {
		assertArrayEquals(new int[] {0,1,2,4,5,3}, BuildArray.buildArray(new int[] {0,2,1,5,3,4}));
	}

	@Test
	public void test2() {
		assertArrayEquals(new int[] {1,6,8,2,2,7,6,6,8}, BuildArray.buildArray(new int[] {3,2,6,1,7,4,8,2,6}));
	}
	
	@Test
	public void test3() {
		assertArrayEquals(new int[] {4,5,0,1,2,3}, BuildArray.buildArray(new int[] {5,0,1,2,3,4}));
	}
	
	@Test
	public void test4() {
		assertArrayEquals(new int[] {3,6,2,3,8,0,1,9,4,2}, BuildArray.buildArray(new int[] {9,4,3,2,6,7,8,0,1,3}));
	}
	
	
}
