import java.util.*;

public class GenerateSubsequnces {
    public static void main(String[] args) {
        int[] arr = { 9, 5, 7 };
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        solve(0, current, arr, ans);
        System.out.println(ans);
    }

    public static void solve(int index, ArrayList<Integer> current, int[] arr, ArrayList<ArrayList<Integer>> ans) {

        if (index >= arr.length) {
            // Add a deep copy of the current subsequence to the answer list
            ans.add(new ArrayList<>(current));
            return;
        }

        // Pick Condition
        current.add(arr[index]);
        solve(index + 1, current, arr, ans);

        // NoPick Condition
        current.remove(current.size() - 1);
        solve(index + 1, current, arr, ans);
    }
}
