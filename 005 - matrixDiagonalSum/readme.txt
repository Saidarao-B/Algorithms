Matrix Diagonal Sum

Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

 

Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.


Example 2:
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8


Example 3:
Input: mat = [[5]]
Output: 5
 
Hint:
There will be overlap of elements in the primary and secondary diagonals if and only if the length of the matrix is odd, which is at the center.

Constraints:
n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100

-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Solution:

package matrixDiagonalSum;

public class MatrixDiagonalSum {
	public int diagonalSum(int[][] mat) {
	    int sum = 0;
	    for(int row = 0; row < mat[0].length; row++){
	        sum += mat[row][row]+ mat[row][mat[row].length - row-1];
	        if(mat[row].length % 2 == 1 && row == (mat[row].length)/2){
	                sum -= mat[mat.length /2][mat.length /2];
	        }
	    }
	    return sum;
	}
}


-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Test cases:

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

											*-*-*-*-*-*-*
-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-|  Thank you  |-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
											*-*-*-*-*-*-*