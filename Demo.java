
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Demo {

    public class Edge {

        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public void createEdge(ArrayList<Edge>[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        arr[0].add(new Edge(0, 1));
        arr[0].add(new Edge(0, 2));

        arr[1].add(new Edge(1, 0));
        arr[1].add(new Edge(1, 2));

        arr[2].add(new Edge(2, 0));

    }

    public void addEdge(ArrayList<Edge>[] arr, int src, int dest) {

        arr[src].add(new Edge(src, dest));
        // arr[dest].add(new Edge(dest, src));

    }

    public void printGraph(ArrayList<Edge>[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Vertex " + i + ": Neighbors = ");
            for (int j = 0; j < arr[i].size(); j++) {
                Edge e = arr[i].get(j);
                System.out.print("(" + e.src + "," + e.dest + ") ");
            }

            System.out.println();
        }
    }

    public void bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();

        int V = graph.length;

        boolean[] visited = new boolean[V];

        q.add(0);

        while (!q.isEmpty()) {
            int temp = q.remove();

            if (visited[temp] == false) {
                System.out.println(temp);
                visited[temp] = true;

                for (int i = 0; i < graph[temp].size(); i++) {
                    Edge e = graph[temp].get(i);
                    q.add(e.dest);
                    // q.add(graph[temp].get(i).dest);
                }
            }
        }

    }

    public void bfsTraversal(ArrayList<Edge>[] arr) {

        Queue<Integer> q = new LinkedList<>();
        // int root = arr[0].get(0).src;
        int root = 0;

        int n = arr.length;

        boolean[] visited = new boolean[n];

        q.add(root);
        visited[root] = true;

        while (!q.isEmpty()) {
            int temp = q.poll();
            System.out.print(temp + " ");

            for (int j = 0; j < arr[temp].size(); j++) {
                Edge e = arr[temp].get(j);

                if (visited[e.dest] == false) {
                    q.add(e.dest);
                    visited[e.dest] = true;

                }
            }

            System.out.println();
        }
    }

    public void dfs(int root, ArrayList<Edge>[] arr, boolean[] visited) {

        visited[root] = true;

        System.out.println(root);

        for (Edge e : arr[root]) {

            if (!visited[e.dest]) {
                dfs(e.dest, arr, visited);
            }

        }

    }

    public static void main(String[] args) {
        Demo graph = new Demo();

        int vertices = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] arr = new ArrayList[vertices];

        // graph.createEdge(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        graph.addEdge(arr, 0, 1);   
        graph.addEdge(arr, 0, 2);
        graph.addEdge(arr, 1, 3);

        // graph.printGraph(arr);
        System.out.println("-------BFS--------");
        graph.bfs(arr);
        System.out.println("-------DFS--------");
        boolean[] visited = new boolean[vertices];
        int root = arr[0].get(0).src;
        graph.dfs(root, arr, visited);

    }
}
