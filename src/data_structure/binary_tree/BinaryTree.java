package data_structure.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public Node root;
    BinaryTree(int item){
        root = new Node(item);
    }
    BinaryTree(){
        root = null;
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }
    public void preOrderTraversal(){
        preOrderTraversal(root);
    }
    public void postOrderTraversal(){
        postOrderTraversal(root);
    }
    public void levelOrderTraversal(){
        levelOrderTraversal(root);
    }
    public int height(){
        return height(root);
    }
    public void levelOrderTraversalWithQueue(){
        levelOrderTraversalWithQueue(root);
    }

    /***
     * Time Complexity : All node in tree traversal one time.
     *                  so the time complexity is O(n)
     ***/
    private int height(Node node){
        if (node == null)
            return 0;
        else{
            int heightRight = height(node.right);
            int heightLeft  = height(node.left);
            return Math.max(heightRight,heightLeft)+1;
        }
    }

    /***
     * Time Complexity : All node in tree traversal one time.
     *                  so the time complexity is O(n)
     ***/
    private void inOrderTraversal(Node node){             //left root right
        if(node!=null){
            inOrderTraversal(node.left);
            System.out.print(node.data+" ");
            inOrderTraversal(node.right);
        }
    }

    /***
     * Time Complexity : All node in tree traversal one time.
     *                  so the time complexity is O(n)
     ***/
    private void preOrderTraversal(Node node){            //root left right
        if(node!=null){
            System.out.print(node.data+" ");
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }
    }

    /***
     * Time Complexity : All node in tree traversal one time.
     *                  so the time complexity is O(n)
     ***/
    private void postOrderTraversal(Node node){            //left right root
        if(node!=null){
            System.out.print(node.data+" ");
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }
    }

    /***
     * Time Complexity : All node in tree traversal one time.
     *                  so the time complexity is O(n)
     ***/
    private void levelOrderTraversal(Node node){
        // T(n) = O(n^2)

        int rootHeight = height(root);
        for(int i=1;i<=rootHeight;++i)
            printCurrentLevel(root,i);
    }

    private void printCurrentLevel(Node node,int level){
        if (node!=null){
            if (level == 1)
                System.out.print(node.data+" ");
            else{
                printCurrentLevel(node.left,level-1);
                printCurrentLevel(node.right,level-1);
            }
        }
    }
    private void levelOrderTraversalWithQueue(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node rightOfFront = queue.peek().right;
            Node leftOfFront = queue.peek().left;

            if (leftOfFront!=null) {
                queue.add(leftOfFront);
                System.out.print(leftOfFront.data + " ");
            }
            if (rightOfFront!=null){
                queue.add(rightOfFront);
                System.out.print(rightOfFront.data+'\n');
            }
            queue.remove();
        }
    }

}
