Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15,18], target = 20
Output: [0,4]
Explanation: Because nums[0] + nums[4] == 20, we return [0, 4].



Example 2:

Input: nums = [1,3,2,4], target = 7
Output: [1,3]



Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.

-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Solution:

package algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> history = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(history.containsKey(complement)){
                return new int[] {history.get(complement), i};
            }
            history.put(nums[i], i);
        }
        return null;        
    }
}

-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

Test cases:

package algorithms;

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
