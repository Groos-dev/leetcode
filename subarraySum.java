class Solution {
  public int subarraySum(int[] nums, int k) {
    int n = nums.length;
    int[] preSum = new int[n + 1];
    int ans = 0;
    for (int i = 1; i <= n; i++) {
      preSum[i] = preSum[i - 1] + nums[i - 1];
    }
    Map<Integer, Ineteger> map = new HashMap<>();
    for (int i = 0; i <= n; i++) {
      if (map.containsKey(preSum[i] - k)) {
        ans += map.get(preSum[i] - k);
      }
      map.put(preSum[i], map.getOrDefault(preSum[i], 0) + 1);
    }
    return ans;
  }
}
