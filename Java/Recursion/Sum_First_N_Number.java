public class Sum_First_N_Number {
    public static void main(String[] args) {
        System.out.println(sumNum(10, 1, 0));

    }

    static int sumNum(int n,int k, int sum){
        if (k == n) {
            return sum;
        }
            return sumNum(n, k+1, sum+k);        
    }
}
