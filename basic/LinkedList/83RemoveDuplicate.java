class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head ==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = slow.next;
        while(fast != null){
            if(slow.val == fast.val){
                while(fast != null && slow.val == fast.val){
                    fast =fast.next;
                }
                slow.next = fast;
            }else{

                slow = slow.next;
                fast = slow.next;

            }
        }
        return head;

    }
}


