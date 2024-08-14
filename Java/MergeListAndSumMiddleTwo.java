import java.util.*;

public class MergeListAndSumMiddleTwo {
    public static void main(String[] args) {
            // List<List<Integer>> ans = new ArrayList<>();
        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45};
        System.out.println(solve(arr1, arr2));
    }

    static int solve(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int len = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            arr3[len+i] = arr2[i];
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        int mid = arr3.length/2;
        return arr3[mid-1] + arr3[mid];
    }
}
