
// import java.util.ArrayList;
// public class Day11Graphs {
//     public class Edge {
//         int src;
//         int dest;
//         public Edge(int src, int dest) {
//             this.src = src;
//             this.dest = dest;
//         }
//     }
//     public void createEdges(ArrayList<Edge>[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = new ArrayList<>();
//         }
//         // arr = {1, 4, 6, 8};
//         arr[0].add(new Edge(0, 1));
//         arr[0].add(new Edge(0, 2));
//         arr[1].add(new Edge(1, 0));
//         arr[1].add(new Edge(1, 3));
//         arr[2].add(new Edge(2, 0));
//         arr[2].add(new Edge(2, 3));
//         arr[2].add(new Edge(2, 4));
//         arr[3].add(new Edge(3, 1));
//         arr[3].add(new Edge(3, 2));
//         arr[3].add(new Edge(3, 4));
//         arr[4].add(new Edge(4, 2));
//         arr[4].add(new Edge(4, 3));
//     }
//     public static void main(String[] args) {
//         Day11Graphs graph = new Day11Graphs();
//         int Vertices = 5;
//         @SuppressWarnings("unchecked")
//         // int[] arr = new int[size];
//         // dataType variableName = new dataType[size];
//         // dataStructure<dataType/clAss>[] variableName = new dataType[sIze];
//         ArrayList<Edge>[] arr = new ArrayList[Vertices];
//         graph.createEdges(arr);
//         for (int idx = 0; idx < arr.length; idx++) {
//             System.out.print(idx + " -> Neighbors: ");
//             for (int i = 0; i < arr[idx].size(); i++) {
//                 Edge e = arr[idx].get(i);
//                 System.out.print("(" + e.src + "," + e.dest + ") ");
//             }
//             System.out.println();
//         }
//     }
// }
import java.util.ArrayList;
import java.util.Scanner;

public class Day11Graphs {

    static ArrayList<Integer> arrList = new ArrayList<>();

    public class Edge {

        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public void createEdges(ArrayList<Edge>[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        // arr = {1, 4, 6, 8};
        arr[0].add(new Edge(1, 4));
        arr[0].add(new Edge(1, 6));
        arr[0].add(new Edge(1, 8));

        arr[1].add(new Edge(4, 1));
        arr[1].add(new Edge(4, 6));

        arr[2].add(new Edge(6, 1));
        arr[2].add(new Edge(6, 4));
        arr[2].add(new Edge(6, 8));

        arr[3].add(new Edge(8, 1));
        arr[3].add(new Edge(8, 6));

    }

    // //  DYNAMIC Directed Graph // Uni-Directional Graph
    // public void addEdges(ArrayList<Edge>[] arr, int src, int dest, int i) {
    //     if (!arrList.contains(src))
    //         arrList.add(src);
    //     arr[arrList.indexOf(src)].add(new Edge(src, dest));
    // }
    // Undirected Graph // Bi-Directional Graph
    public void addEdges(ArrayList<Edge>[] arr, int src, int dest) {
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
            System.out.print(arr[idx].get(0).src + " -> Neighbors: ");
            for (int i = 0; i < arr[idx].size(); i++) {
                Edge e = arr[idx].get(i);
                System.out.print("(" + e.src + "," + e.dest + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day11Graphs graph = new Day11Graphs();

        int Vertices = 4;

        @SuppressWarnings("unchecked")
        // int[] arr = new int[size];
        // dataType variableName = new dataType[size];
        // dataStructure<dataType/clAss>[] variableName = new dataType[sIze];
        ArrayList<Edge>[] arr = new ArrayList[Vertices];

        // graph.createEdges(arr); // Static
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        // Semi - Dynamic
        // int newIdx = 0;
        // graph.addEdges(arr, 1, 4, newIdx);
        // graph.addEdges(arr, 1, 6, newIdx);
        // graph.addEdges(arr, 1, 8, newIdx);
        // newIdx++;
        // graph.addEdges(arr, 4, 6, newIdx);
        // newIdx++;
        // graph.addEdges(arr, 6, 8, newIdx);
        // newIdx++;
        // graph.addEdges(arr, 8, 6, newIdx);

        int noOfEdges = 10;
        for (int i = 0; i < noOfEdges / 2; i++) {
            System.out.print("Enter Src: ");
            int src = sc.nextInt();
            System.out.print("Enter Dest: ");
            int dest = sc.nextInt();
            graph.addEdges(arr, src, dest);
        }

        graph.printGraph(arr); // Dynamic


        

    }
}
