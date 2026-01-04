import java.util.*;

public class PrintAllSubsets {
    public static  List<List<Integer>> res = new ArrayList<>(); 
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<Integer> curr = new ArrayList<>();
        
        solve(nums, 0, curr);
        System.out.println(res);
        }
    
    
    

    public static void solve(int[] nums, int index, List<Integer> curr){
            
        //base Case
        if(index == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        // pick Logic

        curr.add(nums[index]);
        solve(nums, index+1, curr);
        
        // noPick Logic
        
        curr.remove(curr.size()-1);
        solve(nums, index+1, curr);

    }
}

