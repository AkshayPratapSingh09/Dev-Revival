public class NQueen {
    public static void main(String[] args) {
     String a = "hello world";
    System.out.println(solve(a));

    }

    public static String solve(String a){

        char[] s = reverseString(a.toCharArray(),0,a.length()-1);
        int i = 0;

        int l = 0;
        int r = 0;

        int n = s.length;

        while (i<n) {
            while (i<n && s[i] != ' ') {
                s[r++] = s[i++];
            }

            if(l<r){
                s = reverseString(s, l, r);

                s[r] = ' ';
                r++;

                l = r;
            }
            i++;
        }
        return new String(s);
    
    }

    public static char[] reverseString(char[] chars,int start, int end) {

        int i = start;
        int j = end-2;
        while (i<j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        System.out.println("worked");
        return chars;
    }
}