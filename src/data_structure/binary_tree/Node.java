package data_structure.binary_tree;

public class Node{
    public int data;
    public Node right;
    public Node left;
    public Node(int item){
        data = item;
        left = right = null;
    }
}