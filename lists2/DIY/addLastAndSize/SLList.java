public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first; 

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        /* Your Code Here! */
        IntNode n = first ; 
        While (n.next != null ) {
            n = n.next ;
        }
        IntNode last = new IntNode(x,null);
        n.next = last ;
    }

    /** Returns the number of items in the list using recursion. */
    public int size() {
        /* Your Code Here! */
        IntNode n = first ;
        int sum = 0 ;
        While (n != null ) {
            n = n.next ;
            sum++ ;
        }
        return sum ;
    }

}
