import java.util.*;

public class removeDigitToMax {
    public static void main(String[] args) {
        String number = "1321";
        char digit = '1';
        System.out.println(solve(number,digit));
    }

    // You are given a string "number" representing a positive integer 
    // and a character digit. Return the resulting string after 
    // removing exactly one occurrence of digit from number such 
    // that the value of the resulting string in decimal form is 
    // maximized. The test cases are generated such that digit occurs 
    // at least once in the number.

    // I/P:
    // number = "1321"
    // digit = 1

    // O/P:
    // 321

    public static String solve(String number, char digit) {
         int n = number.length();
         String max = "";

        for(int i=0;i < n;i++){
            if(number.charAt(i) == digit){
                String temp = number.substring(0,i) + number.substring(i+1,n);
                if(max.isEmpty() || temp.compareTo(max) > 0 ){
                    max = temp;
                }
               
            }
        }
        return max;
    }
}