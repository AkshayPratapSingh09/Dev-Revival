import java.util.*;


public class Product_array_Puzzle {
    public static void main(String[] args) {
        int nums[] = {10, 3, 5, 6, 2};
        int cnt_zero=0;
        long prod=1;
        for(int x : nums){
            if(x!=0)
            prod *=x;
            else 
            cnt_zero++;
        }
        // System.out.println(prod);
        long arr[] = new long[nums.length];
        if(cnt_zero>1){
            System.out.println(arr);
        }
        else{
            for(int i=0; i<nums.length; i++){
                if(nums[i]!=0){
                    if(cnt_zero==1)
                    arr[i]=0;
                    // else
                    // arr[i] = prod/nums[i];
                    else{
                        arr[i] = prod/nums[i]; 
                    }
                }
               
                else
                arr[i] = prod;
            }
        }
        System.out.println(arr);
    }
}
