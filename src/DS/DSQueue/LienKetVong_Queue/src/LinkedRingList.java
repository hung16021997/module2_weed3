package DS.DSQueue.LienKetVong_Queue.src;

class Node {
    public int data;
    public Node next;
}

public class LinkedRingList {
    public Node front;
    public Node rear;

    public void enQueue(int value) {
        Node temp = new Node();
        temp.data = value;
        if (front == null) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = rear.next;
        }
        rear.next = front;
    }
    public void deQueue() {
        if (front == null) {
            System.out.println("List rỗng");
        } else if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
    }
    public void display() {
        Node temp = front;
        System.out.println("Các phần tử trong hàng đợi tròn: ");
        while (temp.next != front) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
