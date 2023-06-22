package numberOfGoodPairs;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfGoodPairsTest {

	NumberOfGoodPairs goodPairs = new NumberOfGoodPairs();
	
	@Test
	public void test1() {
		assertEquals(10, goodPairs.numIdenticalPairs(new int[] {1,1,1,1,1}));
	}
	
	@Test
	public void test2() {
		assertEquals(4, goodPairs.numIdenticalPairs(new int[] {1,2,3,1,1,3}));
	}
	
	@Test
	public void test3() {
		assertEquals(0, goodPairs.numIdenticalPairs(new int[] {1,2,3,4,5}));
	}
	
	@Test
	public void test4() {
		assertEquals(1, goodPairs.numIdenticalPairs(new int[] {1,1,2,4,5}));
	}

}
