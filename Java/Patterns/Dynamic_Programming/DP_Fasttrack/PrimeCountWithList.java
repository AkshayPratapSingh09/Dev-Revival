import java.util.*;

public class PrimeCountWithList {
    public static void main(String[] args) {
        
        int x = 10;  // Lower bound
        int y = 50;  // Upper bound

        List<Integer> primes = primesInRange(x, y);

    
        System.out.println("Number of primes in range [" + x + ", " + y + "): " + primes.size());
        System.out.println("Primes: " + primes);
    }

    public static List<Integer> primesInRange(int x, int y) {
        if (x >= y) return Collections.emptyList();

        boolean[] isPrime = segmentedSieve(x, y);
        List<Integer> primes = new ArrayList<>();

        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes.add(x + i);
            }
        }
        return primes;
    }

    public static boolean[] segmentedSieve(int low, int high) {
        int limit = (int) Math.sqrt(high) + 1;
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> basePrimes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) basePrimes.add(i);
        }

        boolean[] segment = new boolean[high - low];
        Arrays.fill(segment, true);

        for (int prime : basePrimes) {
    
            int start = Math.max(prime * prime, (low + prime - 1) / prime * prime);

            for (int j = start; j < high; j += prime) {
                segment[j - low] = false;
            }
        }

        return segment;
    }
}
