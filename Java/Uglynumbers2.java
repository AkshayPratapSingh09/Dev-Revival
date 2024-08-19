public class Uglynumbers2 {
    public static void main(String[] args) {
        int n = 1;
        int count = 0;
        int  i =0;
        while (count<n){
        if (i%2==0 || i%3==0 || i%5 ==0){
            count += 1;
            System.out.print(i+" ");
        }
        i++;
    }

}
}
