package study;


import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

public class FirstDemo {
    @Test
    public void JGraphT() {
        long start = System.currentTimeMillis();
        Graph<Integer, DefaultWeightedEdge> graph = createWeightedGraph();
        List<DefaultWeightedEdge> list = DijkstraShortestPath.findPathBetween(graph, 1, 10);
        System.out.println(list != null);
        long end = System.currentTimeMillis();
        System.out.println("Duration " + (end - start));
        if (list != null) {
            for (DefaultWeightedEdge edge : list) {
                System.out.println(edge);
            }
            DijkstraShortestPath dijkstraShortestPath = new DijkstraShortestPath(graph, 1, 10);
            List<DefaultWeightedEdge> list1 = dijkstraShortestPath.getPathEdgeList();
            for (DefaultWeightedEdge edge : list1) {

                System.out.println(new Scanner(edge.toString()).useDelimiter("\\D+").nextInt());
            }
            System.out.println(dijkstraShortestPath.getPathLength());
        }
    }
    private DefaultDirectedWeightedGraph<Integer,DefaultWeightedEdge> createWeightedGraph(){
        DefaultDirectedWeightedGraph<Integer, DefaultWeightedEdge> graph=new DefaultDirectedWeightedGraph <>(DefaultWeightedEdge.class);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(7);
        graph.addVertex(8);
        graph.addVertex(9);
        graph.addVertex(10);
        graph.addVertex(11);
        graph.addVertex(12);
        graph.addVertex(13);
        graph.addVertex(14);
        Graphs.addEdge(graph, 1, 2, 1.0/2);
        Graphs.addEdge(graph, 2, 3, 1.0/2);
        Graphs.addEdge(graph, 3, 4, 1.0/2);
        Graphs.addEdge(graph, 4, 5, 1.0/2);
        Graphs.addEdge(graph, 5, 9, 1.0/2);
        Graphs.addEdge(graph, 6, 7, 1.0/2);
        Graphs.addEdge(graph, 7, 8, 1.0/2);
        Graphs.addEdge(graph, 8, 9, 1.0/2);
        Graphs.addEdge(graph, 9, 10, 1.0/2);
        Graphs.addEdge(graph, 10, 11, 1.0/2);
        return graph;
    }
}
