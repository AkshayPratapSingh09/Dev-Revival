import java.util.*;

public class OverlappingIntervals {
    public static void main(String[] args) {
        // int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        int[][] intervals = {{1,2},{1,2},{1,2}};

        Arrays.sort(intervals, (a,b)-> Integer.compare(a[1], b[1]));
        // System.out.println(Arrays.toString(intervals));
        for (int[] arr : intervals){
            System.out.print(Arrays.toString(arr)+" ");
        }

        int removeOverlaps = 1;
        int lastIdx = intervals[0][1];
        for(int i=1; i< intervals.length; i++){
            if (intervals[i][0] >= lastIdx){
                lastIdx = intervals[i][1];
            } else {
                removeOverlaps++;
            }
        }

        System.out.println(removeOverlaps);

    }
}
