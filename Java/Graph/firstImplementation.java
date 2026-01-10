import java.util.*;

public class firstImplementation {

    static class Graph {

        int size;
        boolean isDirected;
        int ajdMatrix[][];
        boolean isAdjList;

        List<List<Integer>> adjList;

        Graph(int size, boolean isDirected, boolean isAdjList) {
            this.size = size;
            this.isDirected = isDirected;
            this.isAdjList = isAdjList;
            this.ajdMatrix = new int[size][size];
            adjList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        void addMatrixNode(int first, int second) {

            if (this.isDirected) {

                if (this.ajdMatrix[first][second] == 0) {
                    this.ajdMatrix[first][second] = 1;
                }
            } else {

                if (this.ajdMatrix[first][second] == 0) {
                    this.ajdMatrix[first][second] = 1;
                }
                if (this.ajdMatrix[second][first] == 0) {
                    this.ajdMatrix[second][first] = 1;
                }
            }
        }

        void AddAdjListNode(int first, int second) {
            if (this.isDirected) {
                adjList.get(first).add(second);
            } else {
                adjList.get(first).add(second);
                adjList.get(second).add(first);
            }

        }

        void printGraph() {

            if(!isAdjList){

                for (int i = 0; i < this.size; i++) {
                    System.out.print(i);
                    for (int j = 0; j < this.size; j++) {
                        if (this.ajdMatrix[i][j] == 1) {
                            System.out.print("->" + j);
                        }
                        
                    }
                    System.out.println();
                    // System.out.println(i + " " + Arrays.toString(ajdMatrix[i]));
                }
            } else{
                for (int i = 0; i <size; i++) {
                    System.out.print(i+ "->");
                    System.out.println(adjList.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph first = new Graph(5, false, true);
        // first.addMatrixNode(0, 1);
        // first.addMatrixNode(0, 2);
        // first.addMatrixNode(1, 3);
        // first.addMatrixNode(1, 4);
        first.AddAdjListNode(0, 1);
        first.AddAdjListNode(0, 2);
        first.AddAdjListNode(1, 3);
        first.AddAdjListNode(1, 4);
        first.printGraph();

    }

}
