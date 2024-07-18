public class Climbing_Stairs {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Climbing(n, 0));
    }

    static int Climbing(int n){
        if (n==0) return 1;
        if (n==1) return 1;
        int left = Climbing(n-1);
        int right = Climbing(n-2);
        return left + right;

    }
}
