package part5;

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value){
        this.value = value;
        this.next = null;
    }
}

public class stack{

    ListNode dummy;

    public stack(){
        dummy = new ListNode(-1);
    }

    public void push(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = dummy.next;
        dummy.next = newNode;
    }

    public int pop(){
        int value = dummy.next.value;

        dummy.next = dummy.next.next;

        return value;
    }
}