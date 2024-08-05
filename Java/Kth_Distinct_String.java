import java.util.*;

public class Kth_Distinct_String {
    public static void main(String[] args) {
        // String[] arr = {"d","b","c","b","c","a"};
        // String[] arr = {"aaa","aa","a"};
        String[] arr = {"a","b","a"};
        FindKth(3, arr);
        
    }

    static void FindKth(int k, String[] arr){
        LinkedHashMap<String, Integer> hash = new LinkedHashMap<>();
        int flag = 0;
        for ( String s:arr){
            if(!hash.containsKey(s)){
            hash.put(s,1);
            } else{
                hash.put(s,hash.get(s) +1);
            }
        }
        System.out.println(hash);
        String ans = "";
        for (String s:hash.keySet()){
            if(hash.get(s) == 1){
                flag += 1;
            }
            if (flag ==k){
                ans = s;
                System.out.println("Ans is "+s);
                break;
            }

        }
    }
}
