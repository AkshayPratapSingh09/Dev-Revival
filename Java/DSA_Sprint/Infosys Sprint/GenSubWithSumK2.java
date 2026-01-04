import java.util.*;

public class GenSubWithSumK2 {
    public static void main(String[] args) {
        int[] arr = {5,9,4};
        int target = 9;   
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();

        solve(arr, 0, 0, target, ans, curr);

        System.out.println(ans);
    }
    
    public static void solve(int[] arr, int index, int total, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr){


        // base Case
        if(total > target) return;
        if(total == target) {
            ans.add(new ArrayList<>(curr));
            return;   
        };
        if (index >= arr.length){
            return;
        }

        curr.add(arr[index]);
        int sum = total + arr[index];
        solve(arr, index+1, sum, target, ans, curr);
        
        sum -= curr.remove(curr.size()-1);

        solve(arr, index+1, sum, target, ans, curr);
    }

}
