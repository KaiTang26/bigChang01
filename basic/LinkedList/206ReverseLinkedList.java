class Solution_1 {
    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode pre = null;

        while(current !=null){
            ListNode temp = current;
            current = current.next;
            temp.next = pre;
            pre = temp;
        }

        return pre;

    }
}