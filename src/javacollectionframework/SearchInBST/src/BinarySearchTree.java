package javacollectionframework.SearchInBST.src;

import java.util.LinkedList;

public class BinarySearchTree {
    Node root;
    int size = 0;
    public String search(int value) {
        if (root==null) {
            return "Không tìm thấy cây nhị phân";
        } else {
            Node current = this.root;
            while (current != null) {
                if (current.data>value) {
                    current.left = current;
                } else if (current.data<value) {
                    current.right = current;
                } else {
                    return "Tìm thấy tại vị trí root";
                }
            }
            if (current.right.data==value) {
                return "Giá trị được tìm thấy trong cây nhị phân";
            } else if (current.left.data==value) {
                return "Giá trị được tìm thấy trong cây nhị phân";
            } else {
                return "Giá trị không có trong cây nhị phân";
            }
        }
    }

}
class Node {
    Node left;
    Node right;
    int data;
    public Node(int element) {
        this.data = element;
    }
}
