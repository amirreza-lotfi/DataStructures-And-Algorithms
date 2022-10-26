package main.data_structure.map;

public class Node<KEY,VALUE> {
    private KEY key;
    private VALUE value;
    private Node<KEY,VALUE> nextNode;

    public Node(KEY key, VALUE value, Node<KEY, VALUE> nextNode) {
        this.key = key;
        this.value = value;
        this.nextNode = nextNode;
    }

    public KEY getKey() {
        return key;
    }

    public void setKey(KEY key) {
        this.key = key;
    }

    public VALUE getValue() {
        return value;
    }

    public void setValue(VALUE value) {
        this.value = value;
    }

    public Node<KEY, VALUE> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<KEY, VALUE> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return key+" --> "+value;
    }
}
