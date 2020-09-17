class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        ListNode a = swapPairs(head.next.next);
        ListNode temp = head.next;
        head.next.next = head;
        head.next = a;
        return temp;

    }
}