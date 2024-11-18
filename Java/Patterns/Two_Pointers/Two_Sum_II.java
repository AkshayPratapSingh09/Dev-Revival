import java.util.*;

public class Two_Sum_II {

    public static void main(String[] args) {
        int []numbers = {2,7,11,15};
        int target = 9;

        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            if(numbers[left] + numbers[right] > target){
                right--;
            }
            else if(numbers[left] + numbers[right] < target){
                left++;
            }
            else{
                System.out.println("["+(left+1)+" , "+(right+1)+"]");
                break;
            }
        }

    }

}
