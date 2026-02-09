import java.util.ArrayList;
import java.util.NoSuchElementException;

public static class Queue {
    private final ArrayList<Integer> q;

    public Queue(ArrayList<Integer> inp) {
        q = inp;
    }

    public void add(int el) {
        q.add(el);
    }

    public int remove() {
        if(q.isEmpty()) throw new NoSuchElementException();
        return (q.removeLast());
    }

    public int peek() {
        if(q.isEmpty()) throw new NoSuchElementException();
        return (q.getLast());
    }

    public int size() {
        return q.size();
    }

    public boolean isEmpty() {
        return (q.isEmpty());
    }
}

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
