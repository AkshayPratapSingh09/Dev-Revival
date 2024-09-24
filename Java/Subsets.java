import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        List<List<Integer>> res = subsets(nums);
        System.out.println(res);
        
    }

    static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        // System.out.println(res);

        for (int num:nums) {
            // System.out.println("Num : "+num);
            int n = res.size();
            // System.out.println("Size this time: "+n);

            for (int i = 0; i < n; i++) {
                // System.out.println("From res: "+res.get(i));
                List<Integer> temp = new ArrayList(res.get(i));
                // System.out.println("Temp here: "+temp);
                temp.add(num);
                System.out.println("Temp after add: "+temp);
                res.contains(temp)
                res.add(temp);
                System.out.println("res after add: "+res);
            }
        }

        return res;
    }
}
