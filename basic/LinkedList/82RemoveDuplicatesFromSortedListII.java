class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode current = head;

        while(current != null && current.next !=null){


           if(current.val == current.next.val){
               pre.next = current.next.next;
           }else{
              if(pre.next != null && pre.next.val <= current.val) {
                  pre = pre.next;
              }
           }

            current =current.next;

        }

        return dummy.next;

    }
}