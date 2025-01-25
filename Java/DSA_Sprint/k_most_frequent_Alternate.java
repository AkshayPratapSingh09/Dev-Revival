import java.util.*;

public class k_most_frequent_Alternate {
    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] topKFrequent(int[] nums, int k) {

        if (k == nums.length)
            return nums;

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hash.containsKey(nums[i])) {
                hash.put(nums[i], 1);
            } else {
                hash.put(nums[i], hash.get(nums[i]) + 1);
            }

        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (int i = 0; i < buckets.length; i++) {

            buckets[i] = new ArrayList<>();

        }
        System.out.println(Arrays.toString(buckets));
        
        for (int i: hash.keySet()) {
            buckets[hash.get(i)].add(i);
        }
        System.out.println(Arrays.toString(buckets));

        List<Integer> temp = new ArrayList<>();

        for (int i = buckets.length-1; i >=0 ; i--) {
            List<Integer> list = buckets[i];
            for(int j: list){
                temp.add(j);
            }
        }

        int[] ans = new int[k];

        while (k-- > 0) {
            ans[k] = temp.get(k);
        }

        return ans;
    }

}
