import java.util.*;

public class findCentreOfStarGraph {
    public static void main(String[] args) {
        int[][]edges = {{1,2},{2,3},{4,2}};
        HashMap<Integer, Integer> has = new HashMap<>();
        int n = edges.length;
        int ans = -1;
        int currMax = 0;

        for (int i =0;i<n;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            has.put(u,has.getOrDefault(u,0)+1);
            has.put(v,has.getOrDefault(v,0)+1);
            if(has.get(u) > currMax){
                ans = u;
            }
            else if(has.get(v) > currMax){
                ans = v;
                
            }

            currMax = Math.max(currMax, (Math.max(has.get(u), has.get(v))));
            System.out.println(currMax);

        }

        System.out.println(has);
        System.out.println(ans);


        // The node with the highest 
    }
}
