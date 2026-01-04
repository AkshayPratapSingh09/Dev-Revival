import java.util.*;

public class GenerateSubSeqWithSumK {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 3, 4, 1};
        int target = 9;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        solve(0, target, ans, curr, arr);
        System.out.println(ans);
    }

    public static void solve( int index,int k, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr, int arr[]){
        if(index >= arr.length){
            if(checkSum(curr, k)){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        //pick Logic
        curr.add(arr[index]);
        solve(index+1, k, ans, curr, arr);
        
        //noPick Logic
        curr.remove(curr.size()-1);
        solve(index+1, k, ans, curr, arr);

    }

    public static boolean checkSum(ArrayList<Integer> curr, int k){
        int n = curr.size();
        int sum = 0;
        for (Integer i : curr) {
            sum += i;
        }
        if (sum == k)return true;
        return false;
    }
}
