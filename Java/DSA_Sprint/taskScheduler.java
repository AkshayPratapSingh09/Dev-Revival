import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class task {
    int frequency;
    int executionTime;

    public task(int freq, int exTime) {
        frequency = freq;
        executionTime = exTime;
    }

    public int compareTo(task that) {
        return that.frequency - this.frequency;
    }
}

public class taskScheduler {
    public static void main(String[] args) {
        char[] tasks = { 'A', 'C', 'A', 'B', 'D', 'B' };
        int n = 1;

        // output = 6
        
        System.out.println(schedule(tasks, n));
    }

    public static int schedule(char[] tasks, int n) {
        HashMap<Character, Integer> hash = new HashMap<>();

        for (char c : tasks) {
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }
        
        System.out.println(hash);
        
        PriorityQueue<task> pq = new PriorityQueue<>();
        
        for(Character ch:hash.keySet()){
            int freq = hash.get(ch);
            pq.offer(new task(freq, 0));
        
        }

        System.out.println(pq);

        Queue<task> queue = new LinkedList<>();
        int time = 0;
        while (!queue.isEmpty() || !pq.isEmpty()) {
            time++;
            if(!pq.isEmpty()){
            task task = pq.poll();
            task.frequency--;
            if(task.frequency>0){
                task.executionTime = time + n;
                queue.offer(task);
            }
        }

            if(!queue.isEmpty() && queue.peek().executionTime == time){
                pq.offer(queue.poll());
            }
        }

        return time;

    }
}
