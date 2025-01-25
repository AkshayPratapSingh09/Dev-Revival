import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
        char[] str1 = {'e','a','t'};
        char[] str2 = {'t','a','e'};

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hash = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
         char[] curr = strs[i].toCharArray();
         Arrays.sort(curr);
         String sortedCurr = new String(curr);
         if (!hash.containsKey(sortedCurr)) {
                hash.put(sortedCurr, new ArrayList<>());
            }
            hash.get(sortedCurr).add(strs[i]);
        }
        return new ArrayList<>(hash.values());
    }

    
}
