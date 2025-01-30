public class CountAndSay {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solve(n));
    }

    public static String solve(int n){
        if(n==1) return "1";

        String s = solve(n-1);

        StringBuilder res = new StringBuilder("");
        // String res  = "";

        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            counter++;
            if(i==s.length()-1 || s.charAt(i) != s.charAt(i+1)){
                res.append(counter);
                res.append(s.charAt(i));
                counter = 0;
            }
        }
        return res.toString();
    }
}