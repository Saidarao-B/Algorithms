package twoSum;

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
