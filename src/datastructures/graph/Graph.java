package datastructures.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    private int numberOfVertices;
    private LinkedList<Integer> adj[];

    Graph(int v) {
        this.numberOfVertices = v;
        this.adj = new LinkedList[this.numberOfVertices];

        for (int i = 0; i < this.numberOfVertices; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        this.adj[v].add(w);
    }

    /**
     * BFS starting from vertex s
     * @param s the starting point
     */
    public void bfs(int s) {
        // set all vertices to false (not visited)
        boolean visited[] = new boolean[numberOfVertices];

        // create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        // set the current node as visited and enqueue it
        visited[s] = true;
        System.out.printf("Starting at %d\n", s);
        queue.add(s);

        while (queue.size() != 0) {
            // dequue a vertex from the queue and print it
            s = queue.poll();
            System.out.printf("De-queuing %d\n", s);

            // get all adjacent vertices of the de-queued vertex s
            // If an adjacent has not been visited, then mark it as
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    System.out.printf("Queueing %d\n",  n);
                    queue.add(n);
                }
            }
        }
    }
}
