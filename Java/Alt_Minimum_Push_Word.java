import java.util.Arrays;

public class Alt_Minimum_Push_Word {
    public static void main(String[] args) {
        // String word = "abcde";
        String word = "xyzxyzxyzxyz";
        int[] letterCounts = new int[26];
        System.out.println(Arrays.toString(letterCounts));
        
        // Count the frequency of each letter in the word.
        for (int i = 0; i < word.length(); ++i) {
            // Increment the count for the current letter.
            // System.out.println(word.charAt(i) - 'a');
            letterCounts[word.charAt(i) - 'a'] += 1;
            System.out.println("This time char : "+word.charAt(i));
            System.out.println(Arrays.toString(letterCounts));
            
        }
        Arrays.sort(letterCounts);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(letterCounts));
        }
}
