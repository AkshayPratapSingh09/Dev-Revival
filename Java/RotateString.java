public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeabf";

        String test = s + s;
        System.out.println(test);
        int len = s.length();

        for (int i=0;i<len;i++){
            if (test.charAt(i) == goal.charAt(0)){
                if (test.substring(i, i+len).equals(goal)){
                    System.out.println("true");
                }
            }
            System.out.println("This time : "+test.substring(i,i+len));
        }
    }
}
