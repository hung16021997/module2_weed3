package DS.DSQueue.daoNguocMang_Stack.src;

import java.util.Arrays;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(6);
        myStack.push(26);
        myStack.push(2);
        myStack.push(19);
        myStack.push(95);
        myStack.push(24);
        myStack.push(4);
        System.out.println(Arrays.toString(myStack.getArr()));
        myStack.reserveArray();
        System.out.println(Arrays.toString(myStack.getArr()));
    }
}
