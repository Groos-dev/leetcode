class Solution {
  public int  maxSubArray(int[] nums) {
    int n = nums.length;
    int preSum = 0;
    int ans = nums[0];
    for(int i = 0; i < n; i++) {
      preSum = Math.max(nums[i], preSum +  nums[i]);
      ans = Math.max(preSum, ans);
    }
    return ans;
  }
}
