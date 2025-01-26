import java.util.Arrays;

public class smallestLargestNumber {
    public static void main(String[] args) {
        // int arr[] = {2,5,1,3,0};
        int arr[] = {8,10,5,7,9};
        System.out.println(smallestNumberIntheArray(arr));
        System.out.println(largestNumberIntheArray(arr));
    }

    public static int smallestNumberIntheArray(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
    public static int largestNumberIntheArray(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}
