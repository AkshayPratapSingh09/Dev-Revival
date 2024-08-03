import java.util.*;
import javafx.util.Pair;

public class CelebrityProblem {
    public static void main(String[] args) {
        int mat[][] = { 
            { 0, 1, 0 },
            { 0, 0, 0 },
            { 0, 1, 0 } 
            };
    }

    static int celeb(int[][] mat){
        HashMap<Integer> hash = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;
        int ans = -1;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                
            }
        }
        
        return -1;
    }
}

class Pair<U, V> {
    private final U first;
    private final V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}