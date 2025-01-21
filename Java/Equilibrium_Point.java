public class Equilibrium_Point {

    public static void main(String[] args) {
        
        // int arr[] = {1, 2, 0, 3};
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(solution(arr));

    }
    
    public static int solution(int arr[]){
        int sum =0;
        int l = arr.length-1;

        for (int i = 0; i <=l; i++) {
            sum+=arr[i];
            arr[i]=sum;
        }

        for (int i = 0; i <= l-1; i++) {
            if(arr[i] == (arr[l] - arr[i+1])){
                return i+1;
            }
        }
        return -1;
    }


}