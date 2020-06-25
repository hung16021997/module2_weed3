package javacollectionframework.BST_IntergerPreOrder.src;

public class Test {
    public static void main(String[] args) {
        BinaryTree numbers = new BinaryTree();
        numbers.insert(37);
        numbers.insert(26);
        numbers.insert(45);
        numbers.insert(20);
        numbers.insert(41);
        numbers.insert(28);
        numbers.insert(30);
        numbers.insert(39);
        numbers.insert(56);
        numbers.insert(6);
        numbers.insert(15);
        numbers.insert(19);
        numbers.postOrder();
    }
}
