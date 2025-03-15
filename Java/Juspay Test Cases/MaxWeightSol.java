// Correct Solution

import java.util.Scanner;

public class MaxWeightSol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = scanner.nextInt(); // Number of cells
            int[] edge = new int[N];
            for (int i = 0; i < N; i++) {
                edge[i] = scanner.nextInt();
            }

            // Array to store weights of each node
            long[] weights = new long[N];

            // Calculate weights
            for (int i = 0; i < N; i++) {
                if (edge[i] != -1) {
                    weights[edge[i]] += i;
                }
            }

            // Check if all weights are zero
            boolean allZero = true;
            for (int i = 0; i < N; i++) {
                if (weights[i] != 0) {
                    allZero = false;
                    break;
                }
            }

            if (allZero) {
                System.out.println(-1); // No valid node with non-zero weight
                continue;
            }

            // Find the node with maximum weight
            int maxNode = 0;
            long maxWeight = weights[0];

            for (int i = 1; i < N; i++) {
                if (weights[i] > maxWeight || (weights[i] == maxWeight && i < maxNode)) {
                    maxNode = i;
                    maxWeight = weights[i];
                }
            }

            // Output the result
            System.out.println(maxNode);
        }

        scanner.close();
    }
}