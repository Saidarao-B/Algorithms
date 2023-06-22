package shuffleTheArray;
/*
 * @author Saidarao Boggavarapu
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for(int i=0; i<n; i++){
            ans[i+i] = nums[i];
            ans[i+i+1] = nums[n+i] ;
        }
        System.gc();
        return ans;
    }
}
