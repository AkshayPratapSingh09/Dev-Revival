import java.util.Arrays;

public class SplitEqualSum {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int sumArr[]= new int[arr.length];
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
            sumArr[i] = sum;
        }
        System.out.println(Arrays.toString(sumArr));
        boolean flag = false;
    
        for (int i = 0; i < sumArr.length-1; i++) {
            if (sumArr[i] == (sumArr[sumArr.length-1] - sumArr[i])){
                // System.out.println(arr[i]+ " " + arr[i+1]);
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
