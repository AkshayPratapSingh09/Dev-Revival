import java.util.ArrayList;
import java.util.Arrays;

public class ShiftArraybyK {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        int K=3;
        int n = array.length;

        K = K % n;
        
        // anothershiftarr(array,K);
        reverseArr(array, 0, n-1);
        // System.out.println(Arrays.toString(array));
        reverseArr(array, 0, K-1);
        // System.out.println(Arrays.toString(array));
        reverseArr(array, K, n-1);
        System.out.println(Arrays.toString(array));
        

    }

    public static void shifarr(int[] array,int k){

        int n = array.length;
        int duplicateArr[] = new int[n*2];
        
        for (int i = 0; i < n; i++) {
            duplicateArr[i] = array[i];
            duplicateArr[n+i] = array[i];
        }

        // int[] ans = Arrays.copyOfRange(duplicateArr,K, K+n);
        array = Arrays.copyOfRange(duplicateArr,k+1, k+n+1);
        System.out.println(Arrays.toString(array));

    }


    public static void anothershiftarr(int[] array, int k){
        int n = array.length;
        int []temp = new int[n];
        for (int i = 0; i < array.length; i++) {
            temp[(i+k)%n] = array[i];
        }

        System.out.println(Arrays.toString(temp));
    }

    public static void reverseArr(int[] arr, int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
