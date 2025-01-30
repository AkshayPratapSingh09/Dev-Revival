public class RepeatedStringMatch {
    public static void main(String[] args) {
        String a = "a", b = "aa";
        System.out.println(solve(a,b));
    }

    public static int solve(String a,String b){
        // String curr="";
        StringBuilder curr = new StringBuilder();
        int count = 0;
        while(curr.length() < b.length()){
            
            curr.append(a);
            count++;

        }

        if(curr.toString().contains(b)){
            return count;
        }

        curr.append(a);
        count++;
        if (curr.toString().contains(b)) {
            return count;
        }

        return -1;
        }
    }
