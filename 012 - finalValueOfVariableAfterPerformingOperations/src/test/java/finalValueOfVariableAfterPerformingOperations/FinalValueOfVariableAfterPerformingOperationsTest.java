package finalValueOfVariableAfterPerformingOperations;

import static org.junit.Assert.*;

import org.junit.Test;

public class FinalValueOfVariableAfterPerformingOperationsTest {
	
	FinalValueOfVariableAfterPerformingOperations finalValue = new FinalValueOfVariableAfterPerformingOperations();
	
	@Test
	public void test1() {
		assertEquals(0, finalValue.finalValueAfterOperations(new String[] {}));
	}
	
	@Test
	public void test2() {
		assertEquals(1, finalValue.finalValueAfterOperations(new String[] {"--X","X++","X++"}));
	}
	
	@Test
	public void test3() {
		assertEquals(3, finalValue.finalValueAfterOperations(new String[] {"++X","++X","X++"}));
	}
	
	@Test
	public void test4() {
		assertEquals(0, finalValue.finalValueAfterOperations(new String[] {"X++","++X","--X","X--"}));
	}
	
	@Test
	public void test5() {
		assertEquals(5, finalValue.finalValueAfterOperations(new String[] {"X++","X++","X++","X++","X++","X++","++X","--X","X--"}));
	}

}
