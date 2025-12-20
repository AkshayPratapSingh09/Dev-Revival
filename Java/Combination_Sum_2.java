import java.util.*;
public class Combination_Sum_2 {
    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> res = subsets(nums,target);
        System.out.println(res);
        
    }
    static List<List<Integer>> ans = new ArrayList<>();

    static int sum(List<Integer> temp){
        int sum = 0;
        for (int i=0; i<temp.size(); i++) { 
            sum += temp.get(i); 
        } 
        return sum;
    }

    static List<List<Integer>> subsets(int[] nums,int target){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
         System.out.println(res);

        for (int num:nums) {
            System.out.println("Num : "+num);
            // System.out.println("Size this time: "+n);
            int n = res.size();

            for (int i = 0; i < n; i++) {
                // System.out.println("From res: "+res.get(i));
                List<Integer> temp = new ArrayList(res.get(i));
                // System.out.println("Temp here: "+temp);
                temp.add(num);
                // System.out.println("Temp after add: "+temp);
                // res.contains(temp)
                res.add(temp);
                if(sum(temp) ==target){
                    ans.add(temp);
                }
                // System.out.println("res after add: "+res);
            }
        }

        return res;
    }
}

