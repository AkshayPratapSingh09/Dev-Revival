import java.util.HashSet;
import java.util.*;

public class Container_With_Most_Water {
    
    public static void main(String[] args) {
        Set<int[][]> setOfArrays = new HashSet<>();
        
        int[][] array1 = {{1, 2}, {3, 4}};
        int[][] array2 = {{5, 6}, {7, 8}};
        int[][] array3 = {{1, 2}, {3, 4}}; // This has the same content as array1 but is a different reference.

        System.out.println(Arrays.toString(array3));
        setOfArrays.add(array1);
        setOfArrays.add(array2);
        setOfArrays.add(array3); // This will be considered a different entry because array1 and array3 are different references.

        System.out.println("Size of the set: " + setOfArrays.size()); // Output: 3
    }
}
