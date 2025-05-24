class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Strign, String> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (map.containsKey(target - num)) {
        return new int[]{i, map.get(target - num)};
      }
      mpa.put(num, i);
    }
    return new int[0];
  }
}
