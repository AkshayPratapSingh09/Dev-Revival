import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergekSortedArray {
    public static void main(String[] args) {
        int k = 3, arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        mergeSorted(arr, k);
    }

    public static ArrayList<Integer> mergeSorted(int[][] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<k;i++){
            for (int j = 0; j < k; j++) {
                pq.add(arr[i][j]);
            }
        }

        System.out.println(pq);
        ArrayList<Integer> ans = new ArrayList<>();

        ans.addAll(pq);

        return ans;
    }
}
