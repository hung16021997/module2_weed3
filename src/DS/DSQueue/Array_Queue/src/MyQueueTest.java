package DS.DSQueue.Array_Queue.src;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(26);
        queue.enqueue(2);
        queue.enqueue(56);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(95);
        queue.enqueue(2020);
    }
}
