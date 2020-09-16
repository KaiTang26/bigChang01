class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        ListNode currL1 = l1;
        ListNode currL2 = l2;

        while (currL1 != null && currL2 !=null){

            while(currL1 != null && currL2 !=null && currL1.val >= currL2.val ){
                curr.next = currL2;
                currL2 = currL2.next;
                curr = curr.next;
            }

            while(currL1 != null && currL2 !=null && currL2.val > currL1.val ){
                curr.next = currL1;
                currL1 = currL1.next;
                curr = curr.next;
            }

        }

        while(currL1 != null){
            curr.next = currL1;
            currL1 = currL1.next;
            curr = curr.next;
        }

        while(currL2 != null){
            curr.next = currL2;
            currL2 = currL2.next;
            curr = curr.next;
        }


        return dummy.next;

    }
}
