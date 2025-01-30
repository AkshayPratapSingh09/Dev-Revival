import java.util.Collections;

public class shortestPalindrome {
    public static void main(String[] args) {
        // String s = "abcd";
        String s = "aacecaaa";
        System.out.println(makePalindrome(s));
    }

    public static String makePalindrome(String s){
        
        String rev = reverseString(s);
        System.out.println(rev);
        

        for (int i = 0; i < s.length(); i++) {
            if(s.substring(0, s.length()-1) == rev.substring(i)){
                return rev.substring(0,1) + s;
            }
        }

        return rev+s;
    }

    public static String reverseString(String s){
        char[] newStr = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < s.length()/2; i++) {
            char temp = newStr[i];
            newStr[i] = newStr[n-i-1];
            newStr[n-i-1] = temp;
        }
        return new String(newStr);
    }
}
