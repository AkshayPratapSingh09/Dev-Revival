import java.util.*;

public class FractionalKnapSack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int capacity = 50;

        int n = val.length;

        // index array to sort by value/weight ratio
        Integer[] indexArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            indexArr[i] = i;
        }

        // sort by decreasing value/weight ratio
        Arrays.sort(indexArr, Comparator.comparingDouble(i -> (double) val[(int) i] / wt[(int) i]).reversed());

        System.out.println(Arrays.toString(indexArr));
        double maxProfit = 0;

        for(int i = 0; i<n;i++){
            if(wt[indexArr[i]] < capacity){
                maxProfit += val[indexArr[i]]; 
                capacity -= wt[indexArr[i]];
                System.out.println("Profit Added "+  val[indexArr[i]]);
                System.out.println("Capacity Now "+  capacity);
            } else if (wt[indexArr[i]] >= capacity){
                System.out.println("Partial Profit Added "+  (double) val[indexArr[i]] *  ((double) capacity / (double) wt[indexArr[i]]));
                maxProfit += (double) val[indexArr[i]] *  ((double) capacity / (double) wt[indexArr[i]]);
                System.out.println("max "+ maxProfit);
                capacity = 0;
            }
        }

        System.out.println(maxProfit);
        // // print sorted ratios
        // for (int i : indexArr) {
        //     System.out.println("Item " + i + " → ratio: " + (double) val[i] / wt[i]);
        // }
    }
}
