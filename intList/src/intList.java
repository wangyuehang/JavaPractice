public class intList {
    public int firstNode;
    public intList nextNode;

    public intList(int first, intList next){
        firstNode = first;
        nextNode = next;
    }

    /**
     *
     * @return Size of the intList
     */
    public int size(){
        intList p = this;
        if(p.nextNode == null){
            return 1;
        }
        return 1+ p.nextNode.size();
    }

    /**
     * Print the intList
     */
    public void printString(){
        intList p = this;
        while(p.nextNode != null){
            System.out.print(p.firstNode + " ");
            p = p.nextNode;
        }
        System.out.println(p.firstNode);
    }

    /**
     * Decrement every number in intList i by x. Using iteration
     */
    public static void decrement(intList i, int x){
        while(i.nextNode != null){
            i.firstNode -= x;
            i = i.nextNode;
        }
        i.firstNode -= x;
    }

    /** Increment every number in intList i by x. Using recursion*/
    public static intList increament(intList i, int x){
        if(i.nextNode == null){
            i.firstNode += x;
            return i;
        }
        else{
            i.firstNode += x;
            return increament(i.nextNode, x);
        }
    }



    public static void main(String[] args) {
        intList myList = new intList(2, null);
        myList = new intList(4, myList);
        myList = new intList(7, myList);
        myList = new intList(9, myList);
        myList = new intList(13, myList);

        myList.printString();
        System.out.println(myList.size());

        decrement(myList, 3);
        myList.printString();

        increament(myList, 5);
        myList.printString();

        myList.printString();
    }
}