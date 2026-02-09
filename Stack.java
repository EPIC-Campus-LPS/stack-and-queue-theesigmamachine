import java.util.ArrayList;
import java.util.NoSuchElementException;

public static class Stack {
    private ArrayList<Integer> numArr;

    public Stack(ArrayList<Integer> s){
        numArr = s;
    }

    public void push(int element){
        numArr.add(element);
    }

    public int pop(){
        if (numArr.isEmpty()) throw new NoSuchElementException();
        else{
            return numArr.removeLast();
        }

    }

    public int peek(){
        if (numArr.isEmpty()) throw new NoSuchElementException();
        else{
            return numArr.getLast();
        }
    }

    public int size(){
        return numArr.size();
    }


    public boolean isEmpty(){
        return (numArr.isEmpty());
    }




}

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
