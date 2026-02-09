import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * A utility class for a queue object, using First-In First-Out (FIFO) functionality.
 * @author Bora Ayhan
 */
public static class Queue {
    private final ArrayList<Integer> q;

    /**
     * Constructor for class
     * @param inp Initial values for queue
     */
    public Queue(ArrayList<Integer> inp) {
        q = inp;
    }

    /**
     * Adds an item to top of queue
     * @param el Item to add on top of queue
     */
    public void add(int el) {
        q.add(el);
    }

    /**
     * Removes last item (first-in) and returns it
     * @return Removed last item
     */
    public int remove() {
        if(q.isEmpty()) throw new NoSuchElementException();
        return (q.removeLast());
    }

    /**
     * Returns first value without removing it
     * @return Value at the bottom of the queue without modifying the queue
     */
    public int peek() {
        if(q.isEmpty()) throw new NoSuchElementException();
        return (q.getLast());
    }

    /**
     * Returns length of queue
     * @return Length of queue
     */
    public int size() {
        return q.size();
    }

    /**
     * Returns true if queue is empty, false otherwise
     * @return True if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return (q.isEmpty());
    }
}

/**
 * Runs a simple test function.
 * @param args command line inputs
 */
public static void main(String[] args) {
    ArrayList<Integer> s = new ArrayList<Integer>(0);
    Queue q = new Queue(s);
    q.add(3);
    q.add(10);
    System.out.println(q.remove());
    System.out.println(q.peek());
    q.add(32);
    q.add(-20);
    System.out.println(q.size());
    System.out.println(q.isEmpty());
}
