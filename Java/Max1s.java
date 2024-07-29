public class Max1s {
    public static void main(String[] args) {
        int arr[][] = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
            };

            MaxOnes(arr);
    }

    static int MaxOnes(int arr[][]){
        int ans = -1;
        for (int[] row:arr){
            for (int i = 0; i < row.length; i++) {
                if(row[i]==1){
                    ans = Math.max(ans,row.length-i);
                    System.out.println("Ones in this row: "+ans);
                    break;
                }
            }
        }
        return ans;
    }
    
}
