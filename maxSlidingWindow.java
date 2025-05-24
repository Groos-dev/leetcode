class Solution {
  public int[] maxSlidingWindow(int[] nums, int size) {
    Deque<Inteeger> deque = new LinkedList<>)();
    for(int i = 0; i < size; i++) {
      while(!deque.isEmpty() && nums[i] >= deque.peekLast()) {
        deque.pollLast();
      }
      deque.addLast(i);
    }
    int[] ans = new int[nums.lenght - size + 1];
    ans[0] = deque.peekFirst();
    for (int i = 0; i < nums.lenght - size + 1; i++) {
      
      

    }

  }
}
