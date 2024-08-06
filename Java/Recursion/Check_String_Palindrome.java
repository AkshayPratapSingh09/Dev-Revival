public class Check_String_Palindrome {
    public static void main(String[] args) {
        String s = "ABGCBA";
        System.out.println(Palindrome(s,0,s.length()));
    }
    static boolean Palindrome(String s, int i,int n){
        if(i>n/2){
            return true;
        }
        if (s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        return Palindrome(s,i+1,n);
    }
}
