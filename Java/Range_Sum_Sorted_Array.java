import java.util.*;

public class Range_Sum_Sorted_Array {
public static void main(String[] args) {
    int arr[] = {1,2,3,4};
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> sumAll = new ArrayList<>();
    int left = 1;
    int right = 10;
    subArray(arr.length, arr, ans, sumAll,left,right);

}

    static void subArray( int n,int[] arr, ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> sumAll,int left,int right)
    {
        // Pick starting point
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                ArrayList<Integer> curr = new ArrayList<>();
                // Print subarray between current starting
                // and ending points
                int sum = 0;
                for (int k=i; k<=j; k++){
                    // System.out.print(arr[k]+" ");
                    curr.add(arr[k]);
                    sum+=arr[k];

                //   System.out.println();
                }
                sumAll.add(sum);
                ans.add(curr);
            }
        }
        System.out.println(ans);
        System.out.println(sumAll);
        Collections.sort(sumAll);
        System.out.println(sumAll);
        int finalSum = 0;
        for (int i = left-1; i < right; i++) {
            System.out.print(sumAll.get(i)+" ");
            finalSum += sumAll.get(i);
        }
        System.out.println(finalSum);
    }
}
