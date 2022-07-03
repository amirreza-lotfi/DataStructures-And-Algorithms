package data_structure.graph;

import java.util.LinkedList;
import java.util.List;

public class DirectedGraph extends SimpleGraph {

    private List<Node> nodeRepository;

    public DirectedGraph() {
        nodeRepository = new LinkedList<>();
        super.setNodeRepository(nodeRepository);
    }


    @Override
    public void addEdge(Node source, Node to) {
        source.edges.add(new Edge(to,0));
    }

    @Override
    void addEdge(Node source, Node to, int weight) {
        source.edges.add(new Edge(to,weight));
    }

    @Override
    public void addNode(Node data){
        nodeRepository.add(data);
    }
}
