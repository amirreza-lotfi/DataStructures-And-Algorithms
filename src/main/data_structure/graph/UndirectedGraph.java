package main.data_structure.graph;

import java.util.*;


public class UndirectedGraph extends SimpleGraph {

    private List<Node> nodeRepository;

    UndirectedGraph(){
        nodeRepository = new ArrayList<>();
        super.setNodeRepository(nodeRepository);
    }

    @Override
    public void addEdge(Node source, Node to) {
        source.edges.add(new Edge(to,0));
        to.edges.add(new Edge(source,0));
    }

    @Override
    void addEdge(Node source, Node to, int weight) {
        source.edges.add(new Edge(to,weight));
        to.edges.add(new Edge(source,weight));
    }

    @Override
    public void addNode(Node data){
       nodeRepository.add(data);
    }





}
