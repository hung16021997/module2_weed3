package DS.DSQueue.LienKetVong_Queue.src;

public class LinkedRingListTest {
    public static void main(String[] args) {
        LinkedRingList circle = new LinkedRingList();
        circle.enQueue(30);
        circle.enQueue(18);
        circle.enQueue(17);
        circle.deQueue();
        circle.deQueue();
        circle.enQueue(13);
        circle.enQueue(21);
        circle.display();
    }
}
