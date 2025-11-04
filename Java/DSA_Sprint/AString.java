// import java.math.BigInteger;
import java.util.*;

public class AString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        // System.out.println("n is "+n);
        // sc.nextLine();
        int[] arr = new int[n];
        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr);
        for (int i = 0; i < n; i++) {
            String one = sc.nextLine();
            int count = 0;
            for (char c:one.toCharArray()) {
                // System.out.println(one);
                if(c == '1')count++;
            }
            // System.out.println("Count here "+count);

		// System.out.println("Count here "+count);
// System.out.println("Count here "+count);
// System.out.println("Count here "+count);
// System.out.println("Count here "+count);
// System.out.println("Count here "+count);
// System.out.println("Count here "+count);
            arr[i] = count;
            // System.out.println(Arrays.toString(arr));
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}