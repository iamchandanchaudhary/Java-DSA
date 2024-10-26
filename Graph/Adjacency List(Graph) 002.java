import java.util.*;

class Classroom {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
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
        // (new Edge(source, destination));
        graph[0].add(new Edge(0, 2));

        // Give values for 1 Vertex 
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        // Give values for 2 Vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        // Give values for 2 Vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }
    public static void main(String args[]) {
        System.out.println("Graph Traversal :- \n");

        Scanner sc = new Scanner(System.in);

        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        System.out.print("Enter Vertex : ");
        int vertex = sc.nextInt();

        // print neighbours
        System.out.print("Their Neighbours : ");
        for(int i = 0; i < graph[vertex].size(); i++) {
            Edge e = graph[vertex].get(i);

            System.out.print(e.dest + " ");
        }
        System.out.println();
    }
}