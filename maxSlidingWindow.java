class Solution {
  public int[] maxSlidingWindow(int[] nums, int size) {
    Deque<Integer> deque = new LinkedList<>();
    for(int i = 0; i < size; i++) {
      while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
        deque.pollLast();
      }
      deque.addLast(i);
    }
    int[] ans = new int[nums.length - size + 1];
    ans[0] = nums[deque.peekFirst()];
    for (int i = 0; i < nums.length - size; i++) {
      if (deque.peekFirst() <= i) {
        deque.pollFirst();
      }
      while(!deque.isEmpty() && nums[i + size] >= nums[deque.peekLast()]) {
        deque.pollLast();
      }
      deque.addLast(i + size);
      ans[i+1] = nums[deque.peekFirst()];
    }
    return ans;
  }
}
