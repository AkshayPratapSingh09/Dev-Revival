import java.util.*;

public class BFSofGraph{
    public static void main(String args[]){
        int[][] adj = { {1,2,3},{4}, {5}, {},{},{}};

        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();
        int l = adj.length;

        boolean[] visited = new boolean[l];

        visited[0] = true;
        q.offer(0);

        while(!q.isEmpty()){
            int u = q.poll();
            visited[u] = true;
            ans.add(u);

            for(int neighbour: adj[u]){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
        System.out.println(ans);
    }
}