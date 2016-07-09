 public  class Solution{
public ListNode reverseList(ListNode head) {
    ListNode last = null;       
    while (head != null) {
        ListNode tmp = head.next;
        head.next = last;
        last = head;
        head = tmp;
    }       
    return last;
}
}
