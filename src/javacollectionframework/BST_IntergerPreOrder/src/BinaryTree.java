package javacollectionframework.BST_IntergerPreOrder.src;

class Node {
    Node left;
    Node right;
    int number;
    public Node(int number) {
        this.number = number;
    }
}
public class BinaryTree {
    Node root;
    int size;
    public BinaryTree() {
    }

    public void insert(int number) {
        if (root == null) {
            root = new Node(number);
        } else {
            Node parent = null;
            Node current = root;
            while (current!=null) {
                if (number>current.number) {
                    parent = current;
                    current = current.right;
                } else if (number<current.number) {
                    parent = current;
                    current = current.left;
                } else {
                    System.out.println("Can't add "+number);
                }
            }
            if (number<parent.number) {
                parent.left = new Node(number);
            }
            if (number>parent.number) {
                parent.right = new Node(number);
            }
        }
        size++;
    }
    public void postOrder() {
        postOrder(root);
    }
    protected void postOrder(Node root) {
        if (root==null) {
            return;
        }
        System.out.println(root.number);
        postOrder(root.left);
        postOrder(root.right);
    }
}
