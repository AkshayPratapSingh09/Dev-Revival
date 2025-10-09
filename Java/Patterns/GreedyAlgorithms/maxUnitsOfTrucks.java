import java.util.*;

public class maxUnitsOfTrucks {
    public static void main(String[] args) {
        
        // int[][] boxTypes = {{1,3},{2,2},{3,1}};
        int[][] boxTypes = {{5,10},{2,5},{4,7}, {3,9}};
        // int truckSize = 4;
        int truckSize = 10;
        int n = boxTypes.length;

        // Integer[] sortedIdx = new Integer[n];
        // for (int i=0; i< n; i++){
        //     sortedIdx[i] = i;
        // }

        Arrays.sort(boxTypes, (a,b) -> Integer.compare( b[1], a[1]));

        // System.out.println(Arrays.toString(sortedIdx));

        int finalUnits = 0;
        for(int[] bt : boxTypes){

            if(truckSize == 0) break;
            int take = Math.min(bt[0], truckSize);
            finalUnits += take* bt[1];
            truckSize -= take;
            // if(bt[0] < truckSize){
            //     finalUnits += bt[1]* bt[0];
            //     System.out.println(finalUnits);
            //     truckSize -= bt[0];
            // } else if (bt[0] > truckSize){
            //     System.out.println("final one "+finalUnits);
            //     finalUnits += truckSize * bt[1];
            //     truckSize = 0;
            //     // break;
            // }
        }
        System.out.println(finalUnits);
    }
}
