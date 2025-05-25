class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    Set<ListNode> set = new HashSet<>();
    ListNode p = headA;
    while(p != null) {
      set.add(p);
      p = p.next;
    }
    p = headB;
    while(p != null) {
      if (set.contains(p)) {
        return p;
      }
      p = p.next;
    }
    return null;
  }
}
