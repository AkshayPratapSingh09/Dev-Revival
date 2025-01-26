
import java.math.BigInteger;
import java.util.*;

public class secondSmallestLargest {
    public static void main(String[] args) {
        int[] arr = {7,1,4,7,2,2,7,5};
        // String[] starr = {"0","0"};
        String[] starr = {"5","5","3","6","7","10"};
        int k = 5;
        // System.out.println(secondSmallest(arr,k));
        // System.out.println(kthLargest(starr,k));
        System.out.println(mostoptimalKthLargest(starr,k));
    }

    public static int secondSmallest(int[] nums,int k){
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());

        for (Integer el : nums) {
            // if(maxpq.size() >k){
            //     maxpq.poll();
            // }
            if(!maxpq.contains(el)){
             maxpq.add(el);
            }
            
        }
        System.out.println(maxpq);

        int ans = 0;
        
        while(k-- >0){
            ans = maxpq.poll();
        }

        return ans;
    }
    public static String kthLargest(String[] nums,int k){
        PriorityQueue<BigInteger> maxpq = new PriorityQueue<>();
        PriorityQueue<Integer> minpq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0; i<k;i++) {
            // if(maxpq.size() >k){
            //     maxpq.poll();
            // }
            // if(!maxpq.contains(Integer.parseInt(el))){
             maxpq.add(new BigInteger(nums[i]));
            // }
            
        }
        System.out.println(maxpq);

        int ans = 0;
        
        // while(k-- >0){
        //     ans = maxpq.poll();
        // }

        for (int i = k; i < nums.length; i++) {
            BigInteger current = new BigInteger(nums[i]);
            if(current.compareTo(maxpq.peek()) > 0){
                maxpq.poll();
                System.out.println(maxpq);
                maxpq.add(new BigInteger(nums[i]));

            }
        }
        return String.valueOf(maxpq.peek());
    }


    public static String mostoptimalKthLargest(String[] nums,int k){
        int N = nums.length;

        PriorityQueue<BigInteger> pq = new PriorityQueue<>();
    
        for(int i=0; i<N;i++){
            pq.offer(new BigInteger(nums[i]));
        }

        BigInteger number = null;
        int limit= N-k+1;

        int i=0;
        System.out.println(pq);

        while(i<limit){
            number = pq.poll();
            i++;
        }

        return number.toString();

    }
}


