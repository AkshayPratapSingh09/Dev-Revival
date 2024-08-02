import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        String s = "101101";
        String curr = "";
        int num = 100;
        String.
        List<String> combinations = new ArrayList<>();
        pow(s, 0, curr,combinations);
        System.out.println(combinations);
        System.out.println(res);
    }
    static int res = 0;
    static void pow(String s, int i, String curr,List<String> combinations){
        if (i == s.length()){
            // if (count_1> (count_0 * count_0))
            if (curr!="" && Integer.parseInt(curr)!=0 && countChar(curr, '1') > (countChar(curr, '0'))*(countChar(curr, '0'))) res +=1;
            combinations.add(curr);
            return ;
        }
        
        pow(s, i+1,curr+s.charAt(i),combinations);
        pow(s, i+1,curr, combinations);

    }

    static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;  
    
    }
}
