public class DLList {

    private static class Node{
        public int item;
        public Node next;
        public Node prev;

        public Node(int i, Node next, Node prev){
            item = i;
            next = null;
            prev = null;
        }
    }

    private Node first;
    private Node end;
    private Node Sentinel;
    private int size;


    public DLList(){
        Sentinel = new Node(14, first, null);
        size = 0;
    }

    public DLList(int i){
        Sentinel = new Node(14, null, null);
        first = new Node(i, null, null);
        Sentinel.next = first;
        size = 1;
    }

    public int getFirst(){
        return first.item;
    }


    public int size(){
        return size;
    }

    public static void main(String[] args) {
        DLList myList = new DLList(10);

        System.out.println(myList.getFirst());
        System.out.print(myList.size());
    }
}