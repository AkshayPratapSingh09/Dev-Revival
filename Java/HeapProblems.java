
import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapProblems {
    public static void main(String[] args) {
        
        int arr[] = {8,3,10,4,11,2,7,6,14,1};
        int k = 3;
        System.out.print("k Smallest numbers are ");
        kSmallest(arr,k);
        System.out.print("k Largest numbers are ");
        kLargest(arr, k);
        System.out.print("kth Smallest numbers is "+kthSmallest(arr, k));
        System.err.println();
        System.out.print("kth Largest numbers is "+kthLargest(arr, k));

    }


    static void kSmallest(int arr[], int k){
        
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
        pq.add(arr[i]);            
        }

        for (int i = k; i < n; i++) {
            if(arr[i]<pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq);
    }
    static int kthSmallest(int arr[], int k){
        
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
        pq.add(arr[i]);            
        }

        for (int i = k; i < n; i++) {
            if(arr[i]<pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return (pq.poll());
    }
    static void kLargest(int arr[], int k){
        
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
        pq.add(arr[i]);            
        }

        for (int i = k; i < n; i++) {
            if(arr[i]>pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq);
    }
    static int kthLargest(int arr[], int k){
        
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
        pq.add(arr[i]);            
        }

        for (int i = k; i < n; i++) {
            if(arr[i]>pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return (pq.poll());
    }



}


