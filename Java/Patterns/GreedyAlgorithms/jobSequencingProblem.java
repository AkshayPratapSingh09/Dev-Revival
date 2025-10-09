import java.util.*;

public class jobSequencingProblem {
    public static void main(String[] args) {
        int deadline[] = {4, 1, 1, 1};
        int profit[] = {20, 10, 40, 30};
        
        int n = deadline.length;

        int assignJobs[] = new int[n+1];
        Arrays.fill(assignJobs, -1);

        int maxDeadline = 0;
        for(int d: deadline){
            maxDeadline = Math.max(maxDeadline,d);
        }
        
        System.out.println("Max deadline is "+maxDeadline);
        Integer[] index = new Integer[n];
        for(int i=0; i<n;i++){
            index[i] = i;
        }
        System.out.println(Arrays.toString(index));
        
        Arrays.sort(index, (a,b) -> profit[b] - profit[a]);
        
        System.out.println("After sorting "+ Arrays.toString(index));

        int count = 0;
        int maxProfit = 0;
        for(int i=0; i<n; i++){
            int ind = index[i];
            int d = deadline[ind];
           
            while (assignJobs[d] != -1) {
                d--;
            }
            if (d==0) continue;
            count++;
            assignJobs[d] = id[ind];
            maxProfit +=  profit[ind];;
        }
    }
}
