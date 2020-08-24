package part4;


 
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 

class Solution {
    /**
     * @param head: The head of linked list.
     * @param val: An integer.
     * @return: The head of new linked list.
     */
    public ListNode insertNode(ListNode head, int val) {
        // write your code here
        if(head==null){
            return new ListNode(val);
        }

        if(head.val>val){
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            return newNode;
        }
        ListNode curr = head;
        while(curr.next !=null && curr.next.val<val){
            curr = curr.next;
        }

        ListNode newNode = new ListNode(val);

        ListNode temp = curr.next;

        if (curr.next != null) {
            newNode.next = temp;
        }
        curr.next = newNode;


        return head;
    }
}