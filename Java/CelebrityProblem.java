import java.util.*;

public class CelebrityProblem {
    public static void main(String[] args) {
        // int mat[][] = {
        // { 0, 1, 0 },
        // { 0, 0, 0 },
        // { 0, 1, 0 }
        // };

        // int mat[][] = { 
        //     { 1, 1 },
        //     { 0, 0 } };

        int mat[][] = { 
            {0, 0, 0, 1, 0},
            {1, 0, 0, 0, 0},
            {1 ,0 ,0 ,0 ,0},
            {0 ,0 ,0 ,0 ,0},
            {0 ,0 ,0 ,1 ,0}
        };
        System.out.println(celeb(mat));
    }

    static int celeb(int[][] mat) {
        HashMap<Integer, Pair<Integer, Integer>> hash = new HashMap<>();

        // pair.first -> Those who know you
        // pair.second -> Those you know

        int m = mat.length;
        if (m==1) return 0;
        int n = mat[0].length;
        int ans = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    if (!hash.containsKey(j)) {
                        hash.put(j, new Pair<Integer, Integer>(1, 0));
                        ans = j;
                    } else {
                        hash.get(j).first += 1;    
                    }
                    
                    if (!hash.containsKey(i)) {
                        hash.put(i, new Pair<Integer, Integer>(0, 1));
                    } else {
                        hash.get(i).second += 1;
                    }
                }
            }
        }

        System.out.println(hash);
        for (int i : hash.keySet()) {
            System.out.println(i + " first = " + hash.get(i).first + " second = " + hash.get(i).second);
        }
        // for (int i: hash.keySet()){
        //     // System.out.println(i+" first = "+hash.get(i).first+" second = "+hash.get(i).second)
        //     if(hash.get(i).second == 0) return i;

        // }
        return ans;
    }
}

class Pair<U, V> {
    U first;
    V second;

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