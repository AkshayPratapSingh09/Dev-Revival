import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";
        String curr = "";
        System.out.println(pow(s, 0, curr));
    }

    static List<String> pow(String s, int i, String curr){
        if (i == s.length()){
            List<String> combinations = new ArrayList<>();
            combinations.add(curr);
            return combinations;
        }
        
        List<String> combinations = new ArrayList<>();
        
        combinations.addAll(pow(s, i+1,curr+s.charAt(i)));
        combinations.addAll(pow(s, i+1,curr));
        return combinations;

    }
}
