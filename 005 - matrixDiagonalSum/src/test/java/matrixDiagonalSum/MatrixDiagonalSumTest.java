package matrixDiagonalSum;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixDiagonalSumTest {
	MatrixDiagonalSum sum = new MatrixDiagonalSum();

	@Test
	public void test1() {
		assertEquals(25, sum.diagonalSum(new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
	}
	
	@Test
	public void test2() {
		assertEquals(5, sum.diagonalSum(new int[][] {{5}}));
	}
	
	@Test
	public void test3() {
		assertEquals(8, sum.diagonalSum(new int[][] {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}));
	}
	
	@Test
	public void test4() {
		assertEquals(9, sum.diagonalSum(new int[][] {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}}));
	}
	
	@Test
	public void test5() {
		assertEquals(27, sum.diagonalSum(new int[][] {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}}));
	}
	
	@Test
	public void test6() {
		assertEquals(2, sum.diagonalSum(new int[][] {{1,0},{0,1}}));
	}

}
