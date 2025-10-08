import java.util.*;

public class QueueImplementation {
    public static void main(String[] args) {
        // Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> queue = new LinkedList<>(); // It is queue with additional Features 
        // We can make addition deletion from both end (not just front/start FIFO)
    
        queue.offer(10);
        queue.offer(2);
        queue.offer(1);
        queue.offer(7);

        System.out.println(queue);
        
        // System.out.println();
        System.out.println(queue.offerFirst(55));
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        System.out.println(queue);
        System.out.println(queue.offerLast(90));
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.pollFirst());
        System.out.println(queue.peekLast());
        System.out.println(queue.poll());
        System.out.println(queue);


        // System.out.println(queue.peek()); //  Peek will return the first element
        // System.out.println(queue.poll()); // Poll is like pop remove and return the primary(first according to FIFO here)
        
        // System.out.println(queue);
    }


}
