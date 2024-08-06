// Make Pairs where first > second

import java.util.ArrayList;

public class Count_Inversion {
    public static void main(String[] args) {
        int arr[] = {5,3,2,4,1};
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] >arr[j]){
                    ArrayList<Integer> curr = new ArrayList<>();
                    curr.add(arr[i]);
                    curr.add(arr[j]);
                    res.add(curr);
                }

            }
        }
        System.out.println(res);
    }
}
