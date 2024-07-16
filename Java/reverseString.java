public class reverseString {
    public static void main(String[] args) {
        String s = "aaba";
        String a = "";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(palindrome(s));
        }
        static boolean palindrome(String s){
        String rev = new StringBuilder(s).reverse().toString();

        return rev.equals(s);

    }
}
