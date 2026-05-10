import java.util.*;

public class DFSofGraph{
    public static void main(String args[]){
        System.out.println("Working");

        ArrayList<Integer> ans = new ArrayList<>();
        
        // int adj[][] = {{2, 3, 1}, {0}, {0, 4}, {0}, {2}};
        int adj[][] = {{1, 2}, {0, 2}, {0, 1, 3, 4}, {2}, {2}};

        int l = adj.length;

        boolean vis[] = new boolean[l];
        dfs(0,vis, adj);
    }

    public static void dfs(int src, boolean[] vis,int[][] adj){
        System.out.print(src+" ");
        vis[src] = true;

        for(int neighbour: adj[src]){
            if(!vis[neighbour]){
                dfs(neighbour, vis, adj);
            }
        }
    }
}