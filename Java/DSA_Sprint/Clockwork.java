import java.util.Arrays;
import java.util.Scanner;

public class Clockwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[cases][];
        String[] ans = new String[cases];
        for (int i = 0; i < cases; i++) {

            int n = sc.nextInt();
            int[] oneArr = new int[n];
            for (int j = 0; j < n; j++) {
                oneArr[j]=sc.nextInt();
            }
            arr[i] = oneArr;

            int flag = 0;
            for (int j = 0; j < oneArr.length; j++) {
                if(oneArr[j] <= 2 * (Math.max(j,n-1-j))){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                ans[i] = "NO";
                System.out.println("NO");
            } else{
                ans[i] = "YES";
                System.out.println("YES");
            };
        
        }


        // System.out.println(Arrays.toString(ans));
    }
}
