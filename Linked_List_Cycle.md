public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode anoHead = head.next.next;
        while(anoHead != null) {
            if(head == anoHead)
                return true;
            head = head.next;
            if(anoHead.next == null)
                return false;
            anoHead = anoHead.next.next;
        }
        return false;
    }
}
