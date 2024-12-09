import java.util.Arrays;

public class prefix_sum_second {
    public static void main(String[] args) {

        // int[][] arr = {{7,1,-6,3,13},
        // {10,5,-1,0,9},{6,4,-3,8,11},{13,-8,-5,12,4},{3,2,1,9,8},{4,3,-2,6,5}};
        // int prefixSum[][] = new int [arr.length][arr[0].length];

        // String Version
        String[][] arr = { { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" } };
        String prefixSum[][] = new String[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            String sum = "";
            for (int j = 0; j < arr[0].length; j++) {
                if (j != 0) {
                    sum += "+" + arr[i][j];
                } else {
                    sum += arr[i][j];

                }
                prefixSum[i][j] = sum;
            }
        }

        for (int i = 0; i < prefixSum[0].length; i++) {
            String sum = "";
        for (int j = 0; j < prefixSum.length; j++) {
            if (j != 0) {
                sum += "+" + prefixSum[j][i];
            } else {
                sum += prefixSum[j][i];
            }
            prefixSum[j][i] = sum;
            // System.out.print(i+" "+j+" + ");
            // System.out.println(prefixSum[j][i] + " ");
        }  
        // System.out.println();
        }

        for (int i = 0; i < prefixSum.length; i++) {

            System.out.println(Arrays.toString(prefixSum[i]));
        }

    }
}
