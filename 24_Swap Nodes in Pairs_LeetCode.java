class Solution {
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while(head != null && head.next != null) {
            ListNode f = head;
            ListNode s = head.next;

            prev.next = s;
            f.next = s.next;
            s.next = f;

            prev = f;
            head = f.next;
        }

            return dummy.next;
        
    }
}