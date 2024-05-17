public class SLList {
    public static class Node{
        public int item;
        public Node next;

        public Node(int i, Node n){
            item = i;
            next = n;
        }
    }

    /** The list always start at sentinel.Next */
    private Node sentinel;
    private int size;

    public SLList(int i){
        sentinel = new Node(16, null);
        sentinel.next = new Node(i, null);
        size = 1;
    }

    public SLList(){
        sentinel = new Node(16, null) ;
        size = 0;
    }

    /** Add an element to the beginning*/
    public void insertFirst(int i){
        size ++;
        sentinel.next = new Node(i, sentinel.next);
    }

    public int getFirst(){
        return sentinel.next.item;
    }


    public void insertLast(int i){
        size++;
        Node ptr = sentinel;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = new Node(i, null);
    }

    public int getLast(){
        Node ptr = sentinel;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        return ptr.item;
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

        SLList emptyList = new SLList();
        emptyList.insertLast(10);
        emptyList.insertFirst(20);
        System.out.println("The size of this list is: " + emptyList.size());
    }
}