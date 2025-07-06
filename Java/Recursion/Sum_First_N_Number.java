public class Sum_First_N_Number {
    public static void main(String[] args) {
        // System.out.println(sumNum(10, 1, 0));
        System.out.println(sumAltNum(10, 1));

    }

    static int sumNum(int n,int k, int sum){
        if (k == n) {
            System.out.println("working");
            return sum;
        }
            return sumNum(n, k+1, sum+k);        
    }
}
