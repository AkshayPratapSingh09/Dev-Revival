import java.util.*;

public class GraphTraversal {
    public void main(String[] args) {
        int[] vis = new int[10];
        // System.out.println(Arrays.toString(vis));
        
    }

    ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj){
        
        Queue<Integer> queue = new LinkedList<>();
        int[] vis = new int[V];
        vis[0] = 1;
        queue.add(0);

        ArrayList<Integer> ans = new ArrayList<>();

        while (!queue.isEmpty()) {
            int node = queue.poll();
            ans.add(node);

            for(int c:adj.get(node)){
                if(vis[c]==0){
                    vis[c] = 1;
                    queue.add(c);
                }
            }
        }
return ans;


    }
}
