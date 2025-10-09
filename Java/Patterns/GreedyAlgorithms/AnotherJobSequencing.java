import java.util.*;

public class AnotherJobSequencing {

    static int[] solve(int[] deadline, int[] profit) {

        int n = deadline.length;
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) { jobs[i][0] = deadline[i]; jobs[i][1] = profit[i]; }

        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0])); // by deadline asc
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // keep chosen profits (min at top)
        int total = 0;

        for (int[] arr : jobs){
            System.out.print(Arrays.toString(arr) + " ");
        }
        System.out.println();
        // [1, 19] [1, 25] [1, 15] [2, 100] [2, 27] 

        for (int[] j : jobs) {
            minHeap.offer(j[1]);
            System.out.println("Heap -> "+minHeap);
            total += j[1];
            if (minHeap.size() > j[0]) {    
                System.out.println("too many jobs for the deadline"); 
                int eliminated =   minHeap.poll();                           // too many jobs before this deadline
                total -= eliminated;                                        // drop the smallest profit
                System.out.println("Dropped low profit -> "+eliminated);
            }
        }
        return new int[]{minHeap.size(), total};
    }

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(solve(
        //         new int[]{4,1,1,1}, new int[]{20,10,40,30}))); // [2, 60]
        System.out.println(Arrays.toString(solve(
                new int[]{2,1,2,1,1}, new int[]{100,19,27,25,15}))); // [2, 127]
        // System.out.println(Arrays.toString(solve(
        //         new int[]{3,1,2,2}, new int[]{50,10,20,30}))); // [3, 100]
    }
}
