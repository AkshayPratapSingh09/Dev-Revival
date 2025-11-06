import java.util.Arrays;
import java.util.Collections;

public class reverse {
    public static void main(String[] args) {
        Integer arr[] = {5,4,3,2,1};
        // Collections.reverse(Arrays.asList(arr));
        // System.out.println(Arrays.toString(arr));

        int n = arr.length;
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }


        System.out.println(Arrays.toString(arr));
    }
}
