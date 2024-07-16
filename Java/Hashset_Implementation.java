import java.util.*;
public class Hashset_Implementation {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        HashMap<Integer,String> Map = new HashMap<>();

        Map.put(1, "January");
        Map.put(2, "February");
        Map.put(3, "March");

        System.out.println(Map);
        System.out.println(Map.get(1));
        System.out.println(Map.replace(1, "December"));
        System.out.println(Map.containsKey(1));

    }
}
