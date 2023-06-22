Build Array from Permutation

Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).


Example 1:
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]



Example 2:
Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
 

Constraints:
1 <= nums.length <= 1000
0 <= nums[i] < nums.length
The elements in nums are distinct.
 
Hint: Can you solve it without using an extra space (i.e., O(1) memory)?.


-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Solution:

package buildArrayFromPermutation;

/*
 * @author Saidarao Boggavarapu
 */

public class BuildArrayFromPermutation {
	public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i<= nums.length-1; i++){
            ans[i] = nums[nums[i]];
        }
        System.gc();
        return ans;
    }
}

-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Test cases:

package buildArrayFromPermutation;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * @author Saidarao Boggavarapu
 */

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

											*-*-*-*-*-*-*
-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-|  Thank you  |-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
											*-*-*-*-*-*-*