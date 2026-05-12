import java.util.*;

public class anotherDetectCycle {
    public static void main(String args[]){
        int V = 4, E = 3, edges[][] = {{0, 1}, {1, 2}, {2, 3}};

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<=V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        System.out.println(adj);

        boolean[] visited = new boolean[V];

        for(int i=0; i<V;i++){
            if(!visited[i] && isCycleDFS(adj, visited, i, -1)){
                System.out.println(true);
            }
        }
        System.out.println(false);
    }   

    public static boolean isCycleDFS(ArrayList<ArrayList<Integer>> adj,boolean[] visited, int curr, int parent){
        
        visited[curr] = true;
        
        for(int neighbour:adj.get(curr)){
            if(neighbour == parent) continue;
            if(visited[neighbour]){
                return true;
            } else{
                if(isCycleDFS(adj, visited, neighbour, curr)){
                    return true;
                }
            }
        }
        return false;
    }

}