
import java.util.ArrayList;
import java.util.Scanner;

// import java.util.ArrayList;
// public class Day10Graphs {
//     public class Edge {
//         int src;
//         int dest;
//         // int weight;
//         public Edge(int src, int dest) {
//             this.src = src;
//             this.dest = dest;
//         }
//     }
//     public void createEdge(ArrayList<Edge>[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = new ArrayList<>();
//         }
//         // arr[src].add(new Edge(src, dest));
//         arr[0].add(new Edge(0, 1));
//         arr[0].add(new Edge(0, 2));
//         arr[1].add(new Edge(1, 0));
//         arr[2].add(new Edge(2, 0));
//     }
//     public void printGraph(ArrayList<Edge>[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int idx = 0; idx < arr[i].size(); idx++) {
//                 Edge e = arr[i].get(idx);
//                 System.out.println("(" + e.src + ", " + e.dest + ")");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Day10Graphs graphs = new Day10Graphs();
//         int vertices = 3;
//         // int[] arr = new int[vertices];
//         // dataType[] variableName = new dataType[size];
//         @SuppressWarnings("unchecked")
//         ArrayList<Edge>[] arr = new ArrayList[vertices];
//         graphs.createEdge(arr);
//         graphs.printGraph(arr);
//     }
// }
// ========= MANUAL CREATION OF EDGES AND GRAPH =====================
public class Day10Graphs {

    ArrayList<Integer> arrList = new ArrayList<>();

    public class Edge {

        int src;
        int dest;
        // int weight;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // // // Semi-Dynamic Insertion of edges (DON'T USE IT)
    // public void createEdge(ArrayList<Edge>[] arr, int src, int dest) {
    //     arr[src].add(new Edge(src, dest));
    //     // arr[dest].add(new Edge(dest, src));
    // }
    // // Dynamic Insertion of edges  (Undirected Graph)
    public void addEdge(ArrayList<Edge>[] arr, int src, int dest) {
        if (!arrList.contains(src)) {
            arrList.add(src);
        }

        arr[arrList.indexOf(src)].add(new Edge(src, dest));

        if (!arrList.contains(dest)) {
            arrList.add(dest);
        }

        arr[arrList.indexOf(dest)].add(new Edge(dest, src));
    }

    public void printGraph(ArrayList<Edge>[] arr) {

        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println("Vertex " + arr[idx].get(0).src + ": ");
            System.out.print("\tNeighbors: ");

            for (int i = 0; i < arr[idx].size(); i++) {
                Edge e = arr[idx].get(i);
                System.out.print("(" + e.src + ", " + e.dest + ")");
            }
            System.out.println();
        }
    }

    public void dfs(ArrayList<Edge>[] arr, int current, boolean[] visited) {

        visited[current] = true;
        System.out.println(arrList.get(current) + " ");

        for (Edge e : arr[current]) {
            int neighborIdx = arrList.indexOf(e.dest);
            if (visited[arrList.indexOf(e.dest)] == false) {
                dfs(arr, neighborIdx, visited);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Day10Graphs graphs = new Day10Graphs();
        int noOfEdges = 3;
        int Vertices = 3;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] arr = new ArrayList[Vertices];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < noOfEdges; i++) {
            System.out.print("Enter Src: ");
            int src = sc.nextInt();
            System.out.print("Enter Dest: ");
            int dest = sc.nextInt();
            graphs.addEdge(arr, src, dest);
        }

        boolean[] visited = new boolean[Vertices];
        // graphs.createEdge(arr, 0, 1);
        // graphs.createEdge(arr, 0, 2);
        // graphs.createEdge(arr, 1, 0);
        // graphs.createEdge(arr, 2, 0);
        // graphs.printGraph(arr);

        graphs.dfs(arr, 0, visited);

    }
}
