package graphs;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class GraphDataStructure {

    public static void main(String[] args) {
        Graph graph = new Graph();

        //add vertex
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

        //add edge
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(6, 5);

        //print result
        graph.showConnections();

    }

}

class Graph {
    private int totalNumberOfNodes;
    HashMap<Integer, ArrayList<Integer>> graphList;

    public Graph() {
        this.totalNumberOfNodes = 0;
        graphList = new HashMap<>();
    }

    public void addVertex(Integer vertex){
        graphList.put(vertex,new ArrayList<>());
        totalNumberOfNodes++;
    }

    public void addEdge(Integer edge1,Integer edge2){
        insertEdges(edge1, edge2);
        insertEdges(edge2,edge1);
    }

    private void insertEdges(Integer edge1, Integer edge2) {
        ArrayList<Integer> connections = graphList.get(edge1);
        connections.add(edge2);
    }

    public void showConnections(){
        graphList.forEach((k,v) -> {
            String stringArray = Arrays.toString(v.toArray());
            System.out.println("vertex: " + k.toString() + " --> " + stringArray);
        });
    }


}

//3 ways of building a graph data structure
//1st: edge list
//2nd: adjacent list
