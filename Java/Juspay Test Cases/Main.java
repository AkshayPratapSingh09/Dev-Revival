import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] edge = new int[N];
        for (int i = 0; i < N; i++) {
            edge[i] = scanner.nextInt();
        }

        boolean[] visited = new boolean[N];
        int maxSum = -1;

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                Map<Integer, Integer> pathMap = new HashMap<>();
                List<Integer> pathList = new ArrayList<>();
                int current = i;
                while (true) {
                    if (pathMap.containsKey(current)) {
                        // Cycle detected, calculate sum
                        int startIdx = pathMap.get(current);
                        int sum = 0;
                        for (int j = startIdx; j < pathList.size(); j++) {
                            sum += pathList.get(j);
                        }
                        if (sum > maxSum) {
                            maxSum = sum;
                        }
                        break;
                    }
                    if (current == -1 || visited[current]) {
                        break;
                    }
                    visited[current] = true;
                    pathMap.put(current, pathList.size());
                    pathList.add(current);
                    current = edge[current];
                }
            }
        }

        System.out.println(maxSum);
    }
}