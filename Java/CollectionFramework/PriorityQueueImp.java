import java.util.*;

public class PriorityQueueImp {

    public static void main(String[] args) {
        
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(10);
        pq.offer(1);
        pq.offer(12);
        pq.offer(3);
        pq.offer(9);

        System.out.println(pq);
    }
}