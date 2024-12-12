import java.util.Arrays;

public class Subarray_Sum_Equals_K {
    
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        int[] pfs = new int [nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            pfs[i] = sum;
        }
        System.out.println(Arrays.toString(pfs));

        int ans = 0;
        for (int i = 0; i < pfs.length; i++) {
            for (int j = i; j < pfs.length; j++) {
                
                if( pfs[j]-pfs[i] == 2){
                    ans +=1;
                }
            }
        }

        System.out.println(ans);
    }
}
