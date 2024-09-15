import java.util.Arrays;
public class StringIteration {
    public static void main(String[] args) {

        String[] arr = {"ab" , "bc", "cd", "da"};
        
        int[] firstCharCounts = new int[26]; // Count occurrences of each first character
        int[] lastCharCounts = new int[26]; // Count occurrences of each last character

        for (String str : arr) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            int firstCharIndex = firstChar - 'a';
            int lastCharIndex = lastChar - 'a';

            firstCharCounts[firstCharIndex]++;
            lastCharCounts[lastCharIndex]++;
        }

        System.out.println("First character counts: " + Arrays.toString(firstCharCounts));
        System.out.println("Last character counts: " + Arrays.toString(lastCharCounts));
        boolean flag = false;
        if(firstCharCounts.length != lastCharCounts.length){
        System.err.println(0);
        } else{
            
            for (int i = 0; i < lastCharCounts.length; i++) {
                if(firstCharCounts[i] != lastCharCounts[i]){
                    System.out.println(0);
                } else{
                    flag=true;
                }
            }
            System.out.println(flag);

        }
        // // Print the counts
        // System.out.println("Character counts: " + Arrays.toString(charCounts));
        // boolean flag = false;
        // for(int i:charCounts){
        //     if(i==1){
        //         System.out.println("false");
        //     }
        //     if(i==2){
        //         flag=true;
        //     }

        // }
        // return flag;
    }
}

