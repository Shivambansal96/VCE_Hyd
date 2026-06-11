
import java.util.ArrayList;

public class Day10Graphs {

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

        for (ArrayList<Day10Graphs.Edge> element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        Day10Graphs graphs = new Day10Graphs();

        int vertices = 3;

        @SuppressWarnings("unchecked")
        // This is an array -> 
        // dataType varName = new dataType[size];
        // int[] arr = new int[size];
        ArrayList<Edge>[] arr = new ArrayList[vertices];

        graphs.createEdge(arr);

    }

}
