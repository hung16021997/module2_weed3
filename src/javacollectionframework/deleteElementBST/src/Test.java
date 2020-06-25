package javacollectionframework.deleteElementBST.src;

public class Test {
    public static void main(String[] args) {
        BSTDelete number = new BSTDelete();
        number.insert(26);
        number.insert(16);
        number.insert(36);
        number.insert(19);
        number.insert(35);
        number.insert(13);
        number.insert(40);
        number.insert(10);
        number.insert(20);
        number.insert(38);
        number.delete(35);
        number.inorder();
    }
}
