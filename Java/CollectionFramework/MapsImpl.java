import java.util.*;

public class MapsImpl {

    public static void main(String[] args) {
        Map<Integer,String> classMap = new HashMap<>();

        classMap.putIfAbsent(1, "Abhinav");
        classMap.putIfAbsent(3, "Bhairav");
        classMap.putIfAbsent(4, "Chandra");
        classMap.putIfAbsent(5, "Ellie");

        System.out.println(classMap);

        // Overriding Values

        // System.out.println(classMap.getOrDefault(2, "No One"));
        // System.out.println(classMap.containsKey(4));
        // System.out.println(classMap.containsValue("Bhola"));

        // Iteration Methods

        // for (Map.Entry<Integer,String> entry : classMap.entrySet()){
        //         System.out.println("Key : "+entry.getKey()+" value : "+ entry.getValue());
        // }

        // Another Method

        // for (Integer key : classMap.keySet()){
        //     System.out.println(key);
        // }
        for (String value : classMap.values()){
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
            System.out.println(value);
        }
    }

}