import java.util.ArrayList;

public class CheckSubSeqWithSumK {
    public static void main(String[] args) {

        // 2 Dimensional DP
        // Pick/NoPick Problem
    
        int[] arr = {10,1,2,7,6,1,5};
        int k = 8;
        int n = arr.length;

        ArrayList<Integer> curr = new ArrayList<>();

        System.out.println(solve(arr, 0, 0, k, curr ));
        
    }

     public static boolean solve(int[] arr, int index, int total, int target, ArrayList<Integer> curr){


        // base Case
        if(total > target) return false;
        if(total == target) {
            System.out.println(curr);
            // ans.add(new ArrayList<>(curr));
            return true;   
        };
        if (index >= arr.length){
            return false;
        }

        //Pick Logic
        curr.add(arr[index]);
        int sum = total + arr[index];
        if(solve(arr, index+1, sum, target, curr)){
            return true;
        }
        
        //No Pick Logic
        sum -= curr.remove(curr.size()-1);
        if(solve(arr, index+1, sum, target, curr)){
            return true;
        }

        return false;

    }
}
