public class SLList {
    public class Node{
        public int item;
        public Node next;

        public Node(int i, Node n){
            item = i;
            next = n;
        }
    }

    public Node head;
    private int size;

    public SLList(int i){
        head = new Node(i, null);
        size = 1;
    }

    /** Add an element to the beginning*/
    public void insertFirst(int i){
        head = new Node(i, head);
        size ++;
    }

    public void insertLast(int i){
        
    }



    public static void main(String[] args) {
        SLList myList = new SLList (5);
        myList.insertFirst(3);
    }
}