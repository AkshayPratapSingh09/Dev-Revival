package Leetcode_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Todays_Question {

    public static void main(String[] args) {
       int[] mapping = {8,9,4,0,2,1,3,5,7,6};
        int[] nums = {991,338,38};

        int[] r = sortJumbled(mapping, nums);
        System.out.println(Arrays.toString(r));
        
    }
  

static int[] sortJumbled(int[] mapping, int[] nums) {
        
    TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
    int n = nums.length;
    int[] res = new int[n]; 

    for (int i=0; i<n; i++){
        int curr = nums[i];
        int ans = 0;
        int factor = 1;
        while(curr>0){
            int rem = curr%10;
            int currMap = mapping[rem];
            // System.out.println(currMap);

            ans = ans + currMap*factor;
            curr = curr/10;
            factor *= 10;
        }
        // System.out.println("Case: "+nums[i]+" = "+ans);
        if(!map.containsKey(ans)){
            map.put(ans, new ArrayList<>());
            map.get(ans).add(nums[i]);
        } else{
            map.get(ans).add(nums[i]);
        }
        // System.out.println(map);
    }

    int g = 0;
   for( Map.Entry<Integer, ArrayList<Integer>> entry: map.entrySet()){
    // System.out.println(entry.getValue());
    ArrayList<Integer> f = entry.getValue();
    for (int j = 0; j < f.size(); j++) {
        res[g] = f.get(j);
        // System.out.println(""+res[g]+" "+ f.get(j));
        g += 1;
        // System.out.println(Arrays.toString(res));
    }

   }
// System.out.println(Arrays.toString(res));
        // 996 -> 669
        // 338 -> 007
        // 37  -> 07

        return res;
}
}