package DS.DSQueue.daoNguocMang_Stack.src;

public class MyStack {
    private int size;
    private int[] arr;
    private int index = 0;
    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        } else {
        arr[index] = element;
        index++;
        }
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
    public void reserveArray() {
        int[] tempArray = new int[this.size];
        for (int i=index-1,j=0;i>=0;i--,j++) {
            tempArray[j] = arr[i];
        }
        arr = tempArray;
    }
    public int[] getArr() {
        return this.arr;
    }
}
