Number of Good Pairs

Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.


Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.


Example 3:
Input: nums = [1,2,3]
Output: 0
 

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100


-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Solution:

package numberOfGoodPairs;

/*
 * @author Saidarao Boggavarapu
 */

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
	    int goodPairCount = 0;
	    if(nums.length == 0)   {
	        return 0;
	    }
	    for(int i=0; i< nums.length-1; i++){
	        for(int j = i+1; j<nums.length; j++){
	            if(nums[i] == nums[j]){
	                goodPairCount++;
	            }
	        }
	    }
	    return goodPairCount;
   }
}
	


-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Test cases:

package numberOfGoodPairs;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * @author Saidarao Boggavarapu
 */

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

											*-*-*-*-*-*-*
-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-|  Thank you  |-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
											*-*-*-*-*-*-*