class Solution {
  public int lengthOfLongestSubstring(String s) {
    int ans = 0;
    Set<Character> set = new HashSet<>();
    char[] str = s.toCharArray();
    int n = str.length;
    int r = 0;
    for (int l = 0; l < n ; l++) {
      while (r < n && !set.contains[str[r]]) {
        set.add(str[r]);
        r++;
      }
      ans = Math.ans(ans, set.size())
      if (r == n) {
        return ans;
      }
      set.remove(str[i]);
    }
    return ans;
  }
}
