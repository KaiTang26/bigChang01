class Solution {
    public ListNode oddEvenList(ListNode head) {
         if(head==null){
            return null;
        }

        ListNode oddHead = head.next;
        ListNode evenP=head;
        ListNode oddP = head.next;

        while(oddP !=null && oddP.next !=null){

            evenP.next = oddP.next;
            evenP = oddP.next;
            oddP.next = evenP.next;
            oddP = evenP.next;

        }

        evenP.next = oddHead;

        return head;
        
    }
}