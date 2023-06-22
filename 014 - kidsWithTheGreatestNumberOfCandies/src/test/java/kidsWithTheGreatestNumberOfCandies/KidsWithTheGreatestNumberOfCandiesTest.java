package kidsWithTheGreatestNumberOfCandies;

import static org.junit.Assert.*;

import org.junit.Test;

public class KidsWithTheGreatestNumberOfCandiesTest {
	KidsWithTheGreatestNumberOfCandies greatestCandies = new KidsWithTheGreatestNumberOfCandies();

	@Test
	public void test1() {
		assertEquals("[true, true, true, false, true]", greatestCandies.kidsWithCandies(new int[] {2,3,5,1,3}, 3).toString());
	}

	@Test
	public void test2() {
		assertEquals("[true, false, false, false, false]", greatestCandies.kidsWithCandies(new int[] {4,2,1,1,2}, 1).toString());
	}
	
	@Test
	public void test3() {
		assertEquals("[true, false, true]", greatestCandies.kidsWithCandies(new int[] {12,1,12}, 10).toString());
	}
	
	@Test
	public void test4() {
		assertEquals("[true, true, true, true]", greatestCandies.kidsWithCandies(new int[] {1,1,1,3}, 2).toString());
	}

}
