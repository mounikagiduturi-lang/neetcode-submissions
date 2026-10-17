class LinkedList {

    Node head;
    Node tail;

    public LinkedList() {
        head = new Node(-1);
        tail=head;
    }

    public int get(int index) {
        if(index<0){
        return -1;
    }
    Node current = head.next;
    while(current !=null && index>0){
        current = current.next;
        index--;
    }
    return current ==null? -1 :current.val;
    }

    public void insertHead(int val) {
        Node node = new Node(val);
        node.next = head.next;
        head.next = node;
        if(tail==head){
            tail=node;
        }
    }

    public void insertTail(int val) {
        Node node = new Node(val);
        tail.next = node;
        tail = node;
    }

    public boolean remove(int index) {
                if (index < 0) {
            return false;
        }

        Node current = head;
        while(current.next !=null && index > 0){
            current = current.next;
            index--;
        }

        if(current.next==null){
        return false;
        }
        if(current.next == tail){
            tail=current;
        }
        current.next= current.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        Node current = head.next;
        while(current!=null){
            aList.add(current.val);
            current=current.next;
        }
        return aList;
    }
}
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}