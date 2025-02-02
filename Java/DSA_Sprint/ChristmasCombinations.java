import java.util.*;

public class ChristmasCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // Total accessories
        int a = sc.nextInt();  // Max candles (second line)
        int b = sc.nextInt();  // Max balloons (third line)
        int C = sc.nextInt();  // Max bells (fourth line)
        
        List<String> combinations = new ArrayList<>();
        
        for (int bells = 0; bells <= Math.min(C, N); bells++) {
            for (int candles = 0; candles <= Math.min(a, N - bells); candles++) {
                int balloons = N - bells - candles;
                if (balloons >= 0 && balloons <= b) {
                    // Build the string in the order: candles (A), balloons (B), bells (C)
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < candles; i++) sb.append('A');
                    for (int i = 0; i < balloons; i++) sb.append('B');
                    for (int i = 0; i < bells; i++) sb.append('C');
                    combinations.add(sb.toString());
                }
            }
        }
        
        // Print the combinations separated by space
        if (combinations.isEmpty()) {
            System.out.println();
        } else {
            System.out.println(String.join(" ", combinations));
        }
    }
}