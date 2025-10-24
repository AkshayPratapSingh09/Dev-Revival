public class CheckDigitStringEqual {

    public static void main(String[] args) {
        String s = "3902";
        System.out.println(solve(s));
    }


    public static boolean solve(String s){
    
        int len = s.length();
        if(len <= 1) return false;
        if(len==2){
            return (len==2 && s.charAt(0) == s.charAt(1))? true : false;
        }
        String temp = "";
        int i =0;
        int j =len - 1;
    
        while(i<j){
            System.out.println(s);
        }
        while(i<j){
            System.out.println(s);
        }
        while(i<j){
            System.out.println(s);
        }
    
        return false;
    
    }

}