public class DLList<Beep>{

    private class Node{
        public Beep item;
        public Node next;
        public Node prev;

        public Node(Beep i, Node next, Node prev){
            item = i;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node last;
    private Node sentinel;
    private int size;


    public DLList(){
        sentinel = new Node(null,null ,null );
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        last = sentinel;
        size = 0;
    }

    public DLList(Beep i){
        last = new Node(i, null, null);
        sentinel = new Node(null, last, last);
        last.prev = sentinel;
        last.next = sentinel;
        size = 1;
    }

    public void addFirst(Beep i){
        Node temp = new Node(i, sentinel.next, sentinel);
        sentinel.next.prev = temp;
        sentinel.next = temp;
        size ++;
    }

    public Beep getFirst(){
        return sentinel.next.item;
    }

    public void addLast(Beep i){
        Node temp = new Node(i, sentinel, last);
        last.next = temp;
        sentinel.prev = temp;
        last = temp;
        size ++;
    }

    public Beep getLast(){
        return sentinel.prev.item;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        DLList<Integer> myList = new DLList<>(10);

        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        System.out.println(myList.size());
        System.out.println("##########################");

        myList.addFirst(5);
        myList.addFirst(0);
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        System.out.println(myList.size());
        System.out.println("##########################");

        myList .addLast(15);
        myList.addLast(20);
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        System.out.println(myList.size());
        System.out.println("##########################");

        DLList<String> strList = new DLList<>("name ");
        strList.addFirst("My ");
        strList.addLast("is ");
        strList.addLast("Ethan.");
        System.out.println(strList.getFirst());
        System.out.println(strList.getLast());
        System.out.println("##########################");

        DLList<Integer> emptyList = new DLList<>();
        emptyList.addLast(5);
        emptyList.addFirst(10);
        System.out.println(emptyList.getFirst());
        System.out.println(emptyList.getLast());

    }
}