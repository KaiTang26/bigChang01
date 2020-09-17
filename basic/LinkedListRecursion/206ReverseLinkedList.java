class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode lastNode = helper(head, dummy);
        return  dummy.next;
    }

    public ListNode helper(ListNode node, ListNode dummy){
        if(node == null ||node.next == null){
            dummy.next = node;
            return node;
        }
        ListNode a = helper(node.next, dummy);
        node.next = null;
        a.next = node;
        return node;


    }
}