public class Print_Linearly_Nth {
    public static void main(String[] args) {
        NthNumbers(1);
    }

    static void NthNumbers(int k){
        if (k>10) return;
        System.out.println(k);
        NthNumbers(k+1);
    }
}
