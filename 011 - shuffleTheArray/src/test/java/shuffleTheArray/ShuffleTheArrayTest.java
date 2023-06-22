package shuffleTheArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShuffleTheArrayTest {

	ShuffleTheArray shuffle = new ShuffleTheArray();
	
	@Test
	public void test1() {
		assertArrayEquals(new int[] {2,3,5,4,1,7}, shuffle.shuffle(new int[] {2,5,1,3,4,7}, 3));
	}

	
	@Test
	public void test2() {
		assertArrayEquals(new int[] {1,4,2,3,3,2,4,1}, shuffle.shuffle(new int[] {1,2,3,4,4,3,2,1}, 4));
	}
	
	
	@Test
	public void test3() {
		assertArrayEquals(new int[] {1,2,1,2}, shuffle.shuffle(new int[] {1,1,2,2}, 2));
	}
	
	
	@Test
	public void test() {
		assertArrayEquals(new int[] {0,3,1,4,2,5}, shuffle.shuffle(new int[] {0,1,2,3,4,5}, 3));
	}
}
