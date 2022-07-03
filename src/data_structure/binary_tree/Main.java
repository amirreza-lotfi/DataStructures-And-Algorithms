package data_structure.binary_tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.right = new Node(8);
        bt.root.left = new Node(3);
        //------------------------------
        bt.root.right.left = new Node(801);
        bt.root.right.left.right = new Node(41);
        bt.root.right.left.right.right = new Node(80);
        bt.root.right.left.right.right.right = new Node(-1);
        bt.root.right.left.right.left = new Node(32);
        bt.root.right.left.right.left.right = new Node(30);
        //--------------------------------
        bt.root.left.left = new Node(12);
        bt.root.left.right = new Node(19);
        bt.root.left.right.left = new Node(10);
        bt.root.left.right.left.right = new Node(22);
        //----------------------------------
        bt.root.left.left.left = new Node(3);
        bt.root.left.left.left.right = new Node(2);
        bt.root.left.left.left.left = new Node(1);

        bt.levelOrderTraversal();
    }
}
