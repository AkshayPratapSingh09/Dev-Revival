import java.util.*;

public class practiceDFSGraph {
    static void dfs(int node, int[][] adj, boolean[] vis, List<Integer> out) {
        vis[node] = true;
        out.add(node);
        for (int nei : adj[node]) {
            if (!vis[nei]) dfs(nei, adj, vis, out);
        }
    }

    public static void main(String[] args) {
        int[][] adj = { {2, 3, 1}, {0}, {0, 4}, {0}, {2} };

        int n = adj.length;
        boolean[] vis = new boolean[n];
        List<Integer> order = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!vis[i]) dfs(i, adj, vis, order);
        }

        System.out.println(order);
    }
}
