import java.util.*;

public class k_most_frequent {
    public static void main(String[] args) {
    
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] topKFrequent(int[] nums, int k) {
        
        if(k == nums.length) return nums;

        HashMap<Integer,Integer> hash = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if(!hash.containsKey(nums[i])){
                hash.put(nums[i], 1);
            } else{
                hash.put(nums[i], hash.get(nums[i]) + 1);
            }

        }

        Queue<Integer> minHeap = new PriorityQueue<>((a,b) -> hash.get(a) - hash.get(b));

        for (int key : hash.keySet()) {
            minHeap.add(key);

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] ans = new int[k];

        for (int i=0;i<k;i++) {
            ans[i] = minHeap.poll();
        }
        // System.out.println(hash);
        // System.out.println(minHeap);
        // System.out.println(Arrays.toString(ans));
        
        return ans;
    }


}
