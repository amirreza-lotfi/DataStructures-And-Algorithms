package main.data_structure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class SimpleGraph {
    private List<Node> nodeRepository;

    public void setNodeRepository(List<Node> nodeRepository) {
        this.nodeRepository = nodeRepository;
    }

    abstract void addEdge(Node source, Node to);
    abstract void addEdge(Node source, Node to, int weight);
    abstract void addNode(Node node);


    /***
     Spanning Tree : spanning tree is an undirected and connected subgraph that is a tree. so it should do not have any cycle.
     Minimum Spanning Tree: it is a tree that the sum of edge`s wights are minimum. The minimum of spanning tree is not unique.
     the Prim main.algorithm is a way that we can find minimum spanning tree of a graph.
     ***/
    public void prim(Node startingNode){
        List<Node> visited = new ArrayList<>();
        visited.add(startingNode);

        while(visited.size()!=nodeRepository.size()){
            //find minimum edge and source node
            Node source = new Node(-1);
            Edge minimumEdge = new Edge(source,Integer.MAX_VALUE);

            for(int i=0;i<visited.size();++i){
                Edge edgeOfVisited = findMinimumEdgeOfNode(visited.get(i),visited);
                if(edgeOfVisited.getWeight() < minimumEdge.getWeight() && !isVisited(edgeOfVisited.getTo(),visited)) {
                    minimumEdge = edgeOfVisited;
                    source = visited.get(i);
                }
            }
            //print data
            System.out.println(source.getData()+" -> "+minimumEdge.getTo().getData()+ "   w:"+ minimumEdge.getWeight());

            //adding edges node to visited
            visited.add(minimumEdge.getTo());
        }

    }


    /**
     * @param start
     * BFS is an algorithms that we can traverse all node in graph
     * we start traversing from start node, and then we print all its adjacent and going on with printing
     * their adjacent until all nodes visited.
     *
     */
    public void BFS(Node start){
        LinkedList<Node> queue = new LinkedList<>();
        List<Node> visitedList = new LinkedList<>();

        queue.add(start);

        while(!queue.isEmpty()){

            Node frontNode = queue.poll();
            System.out.print(frontNode.getData()+" ");
            visitedList.add(frontNode);

            //printing frontNode`s adjacent to queue
            for(Edge edge : frontNode.edges){
                if(!isNodeAvailableInVisitedList(edge.getTo(),visitedList)) {
                    queue.add(edge.getTo());
                    visitedList.add(edge.getTo());
                }
            }

            //if queue is empty and visitedList!=nodeArray.size(), then add disconnected node
            if(queue.isEmpty() && visitedList.size()!=nodeRepository.size()){
                for(Node i: nodeRepository){
                    if(!isNodeAvailableInVisitedList(i,visitedList)){
                        queue.add(i);
                        break;
                    }
                }
            }
        }
    }


    /**
     * @param start
     * DFS main.algorithm is a traversal that we choose a node as root, and then we print All its adjacent.
     * this operation continue until all nodes visit.
     */
    public void DFS(Node start){
        List<Node> visitedList = new ArrayList<>();
        dfs(start,visitedList);
    }

    /**
     * Dijkstra Algorithms
     * In this main.algorithm we try to find the shortest path from one vertex to the other vertices.
     * this algorithms bases on Greedy Algorithms
     * @param start is the start vertex
     */
    public void Dijkstra(Node start){
//        boolean []isNodeHasMinimumDirectionToStart = new boolean[nodeRepository.size()];
//        int[] directionToStart = new int[nodeRepository.size()];
//        Node[] lastNodePath = new Node[nodeRepository.size()];
//
//        for(int i=0;i<nodeRepository.size();++i)
//            directionToStart[i] = Integer.MAX_VALUE;
//        for(int i=0;i<nodeRepository.size();++i)
//            isNodeHasMinimumDirectionToStart[i] = false;
//
//        isNodeHasMinimumDirectionToStart[0] = true;
//        for(int index=0;index< nodeRepository.size()-1;++index){
//
//        }



    }


    private boolean isNodeAvailableInVisitedList(Node i, List<Node> visitedList){
        for(Node node: visitedList){
            if(node.getData()==i.getData())
                return true;
        }
        return false;
    }
    private Edge findMinimumEdgeOfNode(Node node, List<Node> visited){

        Edge minimumEdge = new Edge(new Node(0),Integer.MAX_VALUE);

        //find minimum edge of node
        for(int i=0;i<node.edges.size();++i){
            Edge edgeOfNode = node.edges.get(i);
            if(edgeOfNode.getWeight() < minimumEdge.getWeight() && !isVisited(edgeOfNode.getTo(),visited))
                minimumEdge = edgeOfNode;
        }

        return minimumEdge;

    }
    private boolean isVisited(Node x,List<Node> visited){
        for(Node node : visited){
            if(x.getData() == node.getData())
                return true;
        }
        return false;
    }
    private void dfs(Node start,List<Node> visited){
        visited.add(start);
        System.out.print(start.getData()+" ");

        for(Edge edge: start.edges){
            if(!isNodeAvailableInVisitedList(edge.getTo(),visited)){
                dfs(edge.getTo(),visited);
            }
        }
    }

}
