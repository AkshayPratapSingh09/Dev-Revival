import java.util.*;
public class FindOnlySingleElement {
    public static void main(String[] args) {
        int[] arr = {7,3,5,5,4,4,7,8,3,3};
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        Queue<Integer> ans = new LinkedList<>();
        int second = 1;
        for (int i=0; i<arr.length; i++){
            int count = 0;
        for (int j=0; j<arr.length; j++){
            // System.out.printf("%d %d",arr[i],arr[j]);
            // System.out.println();
            if (arr[i] == arr[j]){
                count++;
                // break;
            }
        }
        if (count == 1) System.out.println(arr[i]);
            }
        }
    }

