class Solution {
  public List<Integer> findAnagrams(String s, String p) {
    int cap = p.length();
    char[] pstr = p.toCharArray();
    Arrays.sort(pstr);
    String simpleStr = new String(pstr);
    int cap = p.length();
    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < s.length() - cap; i++) {
      String subStr = s.substring(i, i + cap);
      char[] subStrArr = subStr.toCharArray();
      Arrays.sort(subStrArr);
      if (simpleStr.equals(new String(subStrArr))) {
        ans.add(i)
      }
    }
    return ans;
  }

  public List<Integer> findAnagrams(String s, String p) {
    int sLen = s.length();
    int pLen = p.length();
    List<Integer> ans = new ArrayList<>();
    if (sLen < pLen) {
      return ans;
    }
    int[] sCount = new int[26];
    int[] pCount = new int[26];
    for (int i = 0; i < pLen; i++) {
      ++sCount[s.charAt(i) - 'a'];
      ++pCount[p.charAt(i) - 'a'];
    }
    if (Arrays.equals(sCount, qCount)) {
      ans.add(0);
    }
    for(int i = 0; i <sLen - pLen; i++) {
      --sCount[s.charAt(i) - 'a'];
      ++sCount[s.charAt(i + pLen) - 'a'];
      if (Arrays.equals(sCount, qCount)) {
        ans.add(i + 1);
      }
    }
  }
}

