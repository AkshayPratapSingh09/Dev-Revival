public class DetectCycleInGraph {
    public static void main(String args[]){
        // int V = 4;
        // int E = 4;
        // int edges[][] = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};
        int V = 3, E = 3, edges[][] = {{0, 1}, {1, 2}, {2, 3}};

        System.out.println(isCycle(V, edges));
    }

    public static boolean isCycle(int V, int[][] edges) {
        // Code here
        int v = edges.length;
        
        boolean[] vis = new boolean[v];
        
        for(int i=0; i<v; i++){
            if(!vis[i]){
                if(isCycleDFS(i,-1, vis, edges)){
                    return true;
                }
            }
        }
        return false;
        
    }
    
    public static boolean isCycleDFS(int src, int par, boolean[] vis,int[][] edges){
        vis[src] = true;
        
        for(int neighbour : edges[src]){
            
            if(!vis[neighbour]){
                if(isCycleDFS(neighbour, src, vis, edges)){
                    return true;
                } else if(neighbour != par){
                    return true;
                }
            }
        }
        return false;
    }
}
