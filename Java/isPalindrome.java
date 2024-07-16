
public class isPalindrome {

    public static void main(String[] args) {
        String s = "abad";
        System.out.println(isPalin(s,0, s.length()-1));


    }

    static boolean isPalin(String s, int l, int n){
        System.out.println();
        if (l>=n){
            return true; 
        }
        if (s.charAt(l)!=s.charAt(n)){
            return false; 
        }
        return isPalin(s, l+1, n-1);
    }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}