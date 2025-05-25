class Solution {
  public int[][] merge(int[][] interval) {
    List<int[]> list = new ArrayList<>();
    Arrays.sort(interval, (a, b) -> a[0] - b[0]);
    int[] preArr = interval[0];
    for(int i = 1; i < interval.length; i++) {
      if (preArr[1] < interval[i][0]) {
        list.add(preArr);
        preArr = interval[i];
      } else {
        preArr[1] = Math.max(preArr[1], interval[i][1]);
      }
    }
    list.add(preArr);
    return list.toArray(new int[list.size()][]);
  }
}
