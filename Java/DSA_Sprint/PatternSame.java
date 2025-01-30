public class PatternSame {
    public static void main(String[] args) {
        String text = "gffgfg";
        String pattern= "gfg";
        System.out.println(solve(text, pattern));
    }

    public static int solve(String s, String pattern){
        if(pattern.length() > s.length()){
            return -1;
        }
        int i=0;
        int j=pattern.length();
        while(j<s.length()+1){
            String cs = s.substring(i, j);
            System.out.println(cs);
            if(cs.equals(pattern)){
                return i;
            }else{
                i++;
                j++;
            }
        }

        return -1;
    }
}
