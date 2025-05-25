class Solution {
  private static res = true;
  private ListNode head = null;
  public boolean isPalindrome(ListNode head) {
    res = true;
    head = head;
    dfs(head)
    
  }
  private void dfs(ListNode cur) {
    if (!res|| cur.next == null) {
      return;
    }
    dfs(cur.next);
    
    if (cur.val != head.val) {
      res = false;
    }
    head = head.next;
  }
}
