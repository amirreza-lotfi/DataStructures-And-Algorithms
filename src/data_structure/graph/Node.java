package data_structure.graph;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private int data;
    public List<Edge> edges;

    Node(int input){
        this.data = input;
        edges = new LinkedList<>();
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
}
