import java.util.*;

public class MinArrowToBurstBaloons {

    public static void main(String[] args) {
        
        int[][] intervals = {{10,16},{2,8},{1,6},{7,12}};

        Arrays.sort(intervals, (a,b)-> Integer.compare(a[1], b[1]));
        // System.out.println(Arrays.toString(intervals));
        for (int[] arr : intervals){
            System.out.print(Arrays.toString(arr)+" ");
        }
        int removeOverlaps = 1;
        int lastIdx = intervals[0][1];
        for(int i=1; i< intervals.length; i++){

            if (intervals[i][0] > lastIdx){
                    removeOverlaps++;

                lastIdx = intervals[i][1];
            }
        
        }


        System.out.println(removeOverlaps);

    }
}