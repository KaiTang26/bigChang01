package part4;

public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        int len =1;
        ListNode temp = head;


        while(temp.next !=null){
            temp = temp.next;
            len++;
        }

        if(len ==n){
            return head.next;
        }else{

            int diff = len -n;
            ListNode pre  = null;
            ListNode curr = head;
            for(int i=0; i<diff; i++){
                pre = curr;
                curr = curr.next;
            }
            
            pre.next = curr.next;
            
            return head;
            
        }
    }
}