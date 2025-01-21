import java.util.Arrays;

public class frogjumpDp {
    public static void main(String[] args) {
        
        int arr[] = new int[] {7, 4, 4, 2, 6, 6, 3, 4};
        // int arr[] = new int[] {10, 20, 30, 10};
        int[] dp = new int[arr.length+1];
        
        Arrays.fill(dp,-1);
        long startTime = System.nanoTime();

        System.out.println(jump(arr, arr.length-1));
        
        long endTime = System.nanoTime();

        System.out.println((endTime-startTime)/ 1000000 +" ms");
        
    }

    // 2 Possibilites
    
    // - 1 - i+1
    // - 1 - i+2

    public static int jump(int arr[], int curr){
        if(curr==0){
            return 0;
        }

        int left = jump(arr, curr-1) + Math.abs(arr[curr] - arr[curr-1]);
        int right = Integer.MAX_VALUE;
        
        if(curr > 1){
        
            right = jump(arr, curr-2) +  Math.abs(arr[curr] - arr[curr-2]);
        
        }

        int cost = Math.min(left,right);
        return cost;
    }
}
