class Solution {
  public ListNode swapKPairs(ListNode head, int k) {
    ListNode tail = head;
    for (int i = 0; i < k; i++) {
      if (tail == null) {
        return head;
      }
      tail = tail.next;
    }
    ListNode newHead = reverse(head, tail);
    head.next = swapKpairs(tail, k);
    return newHead;
  }

  private ListNode reverse(ListNode head, ListNode tail) {
    ListNode prev = null;
    while(head != tail) {
      ListNode temp = head.next;
      head.next = prev;
      prev = head;
      head = temp;
    }
    return prev;
  }
}
