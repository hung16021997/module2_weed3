package DS.DSQueue.Array_Stack.src;

public class MyStack {
    private int size;
    private int arr[];
    private int index = 0;
    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int element) throws StackOverflowError {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
    public int size() {
        return index;
    }
}
