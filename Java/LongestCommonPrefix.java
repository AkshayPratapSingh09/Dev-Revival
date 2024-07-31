import java.util.LinkedList;
import java.util.Queue;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // String []arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String []arr = {"Hello", "World"};
        System.out.println(lcf(arr)); 
    }

    static String lcf(String[] arr){

        if (arr.length == 1){
            return arr[0];
        }
        Queue<Character> queue = new LinkedList<>();
        String ans = "";

        for (int i = 0; i < arr[0].length(); i++) {
            char c = arr[0].charAt(i);
            // ans = ans + c;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j].charAt(i) !=c){
                    if (ans.length() == 0){
                        return "-1";
                    } else {
                        return ans; 
                    }
                }
            
        }
        ans = ans +c;
    }
    return ans;
}
}
