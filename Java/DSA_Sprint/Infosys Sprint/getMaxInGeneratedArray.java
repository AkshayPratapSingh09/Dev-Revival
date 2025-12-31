import java.util.*;

public class getMaxInGeneratedArray {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(solve(7));
        
    }

//     You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated in the following way:
    // nums[0] = 0
    // nums[1] = 1
    // nums[2 * i] = nums[i] when 2 <= 2 * i <= n
    // nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
    // Return the maximum integer in the array nums​​​.

    public static int solve(int n){
        // n --> length of the array
        
        if (n == 0) return 0;
        
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        
        int max = 1;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        int i = 1;

        while(arr.size()<=n){

            int curr1 = arr.get(i);
            arr.add(curr1);
            int curr2 = arr.get(i) + arr.get(i+1);
            arr.add(curr2);
            if(n%2 == 0){
                if(curr1 > max){
                    max = curr1;
                } else if( curr2 > max){
                    max = curr2;
                }
            }
            
            i++;
        //     int curr = 0;
        //     System.out.println("Reached here");
            
        //     if(i+1 % 2 == 0){
        //     curr = arr.get(i-1); 
        //     System.out.println(curr);
        // } else{
        //     curr = arr.get(i-1) + arr.get(i+1); 
        //     }
            // arr.add(curr);
            i++;
            // System.out.println(arr);
        }
        System.out.println(arr);
        return max;
    }
}
