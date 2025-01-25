import java.util.Arrays;

public class Valid_Anagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));


    }

    public static boolean isAnagram(String s, String t) {
        int[] chars = new int[26];
        int[] chars2 = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        Arrays.fill(chars,0);

        for(char c:s.toCharArray()){
            chars[c - 'a'] += 1;
        }
        for(char c:t.toCharArray()){
            chars2[c  - 'a'] += 1;
        }

        System.out.println(Arrays.toString(chars));
        return Arrays.equals(chars, chars2);
    }
}