import java.util.*;

public class KPermutations {
    public static void main(String[] args) {
        char[] arr = {'C', 'C','B'}; // Input array
        int k = 3; // Length of permutation
        
        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        generatePermutations(arr, k, "", used, result);
        
        // Print all permutations
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static void generatePermutations(char[] arr, int k, String current, boolean[] used, List<String> result) {
        if (current.length() == k) {
            result.add(current);
            return;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                generatePermutations(arr, k, current + arr[i], used, result);
                used[i] = false;
            }
        }
    }
}
