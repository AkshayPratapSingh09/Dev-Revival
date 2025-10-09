import java.util.*;

public class maxBagWithFullRocks {
    public static void main(String[] args) {
        // int[] capacity = {2,3,4,5};
        // int[] rocks = {1,2,4,4};
        // int additionalRocks = 2;

        int[] capacity = {10,2,2};
        int[] rocks = {2,2,0};
        int additionalRocks = 100;
        
        int n = rocks.length;
        Integer[] diff = new Integer[n];
        for(int i=0; i<n; i++){
            diff[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(diff);
        System.out.println(Arrays.toString(diff));
        int ans = 0;
        for (int i = 0; i < diff.length; i++) {
            if (additionalRocks == 0) {
                break;
            }
            else if(diff[i] == 0) {
                ans++;
            }
            else if(diff[i]<=additionalRocks) {
                additionalRocks -= diff[i];
                ans++;
        }
    }
    System.out.println(ans);
}
}
