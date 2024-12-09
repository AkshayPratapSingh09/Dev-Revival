import java.util.*;

public class prefix_sum_first {

    public static void main(String[] args) {
        int arr[] = {5,2,7,-3,8};
        int anotherArr[] = {-3,6,2,4,5,2,8,-9,3};

        int ps[] = new int[anotherArr.length];
        int sum = 0;
        
        for (int i = 0; i < anotherArr.length; i++) {
            
            sum += anotherArr[i];
            ps[i] = sum;


        }
        System.out.println(Arrays.toString(ps));
    }
}