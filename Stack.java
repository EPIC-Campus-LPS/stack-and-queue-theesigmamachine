import java.util.ArrayList;
import java.util.NoSuchElementException;


/**
 * A utility class for a stack object, using Last-In First-Out (LIFO) functionality.
 * @author Caden Bents :)
 */

public static class Stack {
    private ArrayList<Integer> numArr;


    /**
     * Constructor for class
     * @param s Initial value for stack
     */
    public Stack(ArrayList<Integer> s){
        numArr = s;
    }

    /**
     * Adds an item to top of the stack
     * @param element Item to add on top of the stack
     */
    public void push(int element){
        numArr.add(element);
    }

    /**
     * Removes last item (Most recently added) and returns it
     * @return Removed last item
     */
    public int pop(){
        if (numArr.isEmpty()) throw new NoSuchElementException();
        else{
            return numArr.removeLast();
        }

    }

    /**
     * Returns value at the top of the stack without removing it
     * @return Value at the end of ArrayList without modifying the stack
     */
    public int peek(){
        if (numArr.isEmpty()) throw new NoSuchElementException();
        else{
            return numArr.getLast();
        }
    }

    /**
     * Returns length of stack
     * @return Length of stack
     */
    public int size(){
        return numArr.size();
    }


    /**
     * Returns true if stack is empty, false otherwise
     * @return True if the stack is empty, false otherwise
     */
    public boolean isEmpty(){
        return (numArr.isEmpty());
    }




}

/**
 * Runs a block of test code
 * @param args command line inputs
 */
public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(0);
    Stack s = new Stack(arr);
    s.push(7);
    s.push(15);
    s.push(35);
    s.push(2);
    System.out.println(s.peek());
    s.push(22);
    System.out.println(s.pop());
    s.peek();
    s.push(14);
    s.pop();
    s.pop();
    System.out.println(s.size());
    System.out.println(s.pop());
}
