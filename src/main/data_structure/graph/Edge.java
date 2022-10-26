package main.data_structure.graph;

public class Edge {
    private Node to;
    private int weight;
    public Edge(Node t, int w){
        this.to = t;
        this.weight = w;
    }

    public int getWeight() {
        return weight;
    }
    public Node getTo() {
        return to;
    }
}
