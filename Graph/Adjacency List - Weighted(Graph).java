import java.util.*;

class Classroom {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    } 

    public static void createGraph(ArrayList<Edge> graph[]) {

        /*
         
            0       3
             \    /  \
              \  /    \
                2 ---- 1
         
         */

        for(int i = 0; i < graph.length; i++) {
            // Conver null value to empty value
            graph[i] = new ArrayList<Edge>();
        }

        // Give values for 0 Vertex
        // (new Edge(source, destination, weight));
        graph[0].add(new Edge(0, 2, 2));

        // Give values for 1 Vertex 
        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        // Give values for 2 Vertex
        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        // Give values for 2 Vertex
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }
    public static void main(String args[]) {
        System.out.println("Graph Traversal :- \n");

        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        // print 2's neighbour & weight
        System.out.println("2's Neighbour & Weight : ");
        for(int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);

            System.out.println(e.dest + " , " + e.wt);
        }
        //System.out.println();
    }
}