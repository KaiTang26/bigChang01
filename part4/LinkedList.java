lass Node{

    public int value;
    public Node next = null;

    public Node(int value){
        this.value = value;
    }

}

class LinkedList{

    private Node dummy;

    public LinkedList(){

        this.dummy = new Node(-1);
    }

    public int get(int location){

        Node curr = dummy.next;

        for (int i=0; i<location; i++){
            curr = curr.next;

        }

        return curr.value;

    }

    public void insert(int value){

        Node pre = dummy;

        while(pre.next !=null){
            pre = pre.next;
        }

        Node newNode = new Node(value);

        pre.next = newNode;

    }

    public void add(int location, int value){
        Node curr = dummy.next;

        for(int i=0; i<location; i++){
            curr = curr.next;
        }

        Node newNode = new Node(value);

        newNode.next = curr.next;
        curr.next = newNode;

    }

    public boolean contains(int value){

        Node  curr = dummy.next;

        while(curr !=null){
            if(curr.value==value){
                return true;
            }

            curr = curr.next;

        }

        return false;
    }

    public void remove(int location){
//        Node curr = dummy.next;
//
//        for(int i=0; i<location-1; i++){
//            curr = curr.next;
//        }
//
//        curr.next = curr.next.next;

        Node pre = dummy;

        for(int i=0; i<location; i++){
            pre = pre.next;
        }

        pre.next = pre.next.next;


    }

    public void print(){

        Node pre = dummy;
        while(pre.next != null){
            pre = pre.next;
            System.out.println(pre.value);
        }
    }



}

