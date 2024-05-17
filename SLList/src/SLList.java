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
        size ++;
        head = new Node(i, head);
    }

    public int getFirst(){
        return head.item;
    }


    public void insertLast(int i){
        size++;
        while(head.next != null){
            head = head.next;
        }
        head.next = new Node(i, null);
    }

    public int getLast(){
        while(head.next != null){
            head = head.next;
        }
        return head.item;
    }

    public int size(){
        return size;
    }


    public static void main(String[] args) {
        SLList myList = new SLList (5);
        myList.insertFirst(3);
        System.out.println("The first element in this list is: " + myList.getFirst());

        myList.insertLast(7);
        System.out.println("The last element in this list is: " + myList.getLast());

        System.out.println("The size of this list is: " + myList.size());
    }
}