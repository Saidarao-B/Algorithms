package buildArrayFromPermutation;

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
