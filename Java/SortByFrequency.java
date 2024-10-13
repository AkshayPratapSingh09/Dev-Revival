import java.util.*;
public class SortByFrequency {
    public static void main(String args[]){
        int arr[] = {5, 5, 4, 6, 4};
        TreeMap<Integer,Integer> has = new TreeMap<>();

        for (int i : arr) {
            // if(!has.containsKey(i)){
            //     has.put(i, 1);
            // } else {
            //     has.put(i, has.get(i)+1);
            // }
        }
        System.out.println(has);
    }
}
