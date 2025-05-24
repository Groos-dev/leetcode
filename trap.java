class Solution {
  public int trap(int[] heights) {
    int n = heights.length;
    int[] maxLeft = new int[n];
    int[] maxRight = new int[n];
    maxLeft[0] = heights[0];
    for (int i = 1; i < n; i++) {
      maxLeft[i] = Math.max(maxLeft[i - 1], heights[i]);
    }
    maxRight[n - 1] = heights[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      maxRight[i] = Math.max(heights[i], maxRight[i+1]);
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
      ans += Math.min(maxLeft[i], maxRight[i]) - heights[i];
    }
  }
}
