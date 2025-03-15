public class LargestSolution {
    
    static int result = -1;

    public static int longestCycle(int[] edges) {
        boolean[] visited = new boolean[edges.length];
        boolean[] inStack = new boolean[edges.length]; // Track nodes in the current DFS path
        int[] discover = new int[edges.length];

        for (int i = 0; i < edges.length; i++) {
            if (!visited[i]) {
                dfs(edges, i, visited, inStack, discover, 1);
            }
        }
        return result;
    }

    public static void dfs(int[] edges, int i, boolean[] visited, boolean[] inStack, int[] discover, int time) {
        visited[i] = true;
        inStack[i] = true;  // Mark as part of the current path
        discover[i] = time;

        int next = edges[i];
        if (next != -1) {
            if (inStack[next]) {  // Cycle detected
                int cycleLength = time - discover[next] + 1;
                result = Math.max(result, cycleLength);
            } else if (!visited[next]) {  // Continue DFS if next node is not visited
                dfs(edges, next, visited, inStack, discover, time + 1);
            }
        }

        // Backtracking
        inStack[i] = false;  // Unmark current node from the current path
        discover[i] = 0;     // Reset discovery time for backtracking (optional)
    }
    public static void main(String[] args) {
        System.out.println(longestCycle(LargestSumTestCases.test2));
    }


}
