public class binarySearch {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,7,7,7,7,7,8,8,9,10};
        int target = 10;
        System.out.println(binarySearch(arr, target));
        

        
    }
    public static int binarySearch(int arr[], int target){

        int i =0;
        int j = arr.length-1;
        int k = arr.length-1;
        int l = arr.length-1;

        while(i<=j){
            int mid =(i+j)/2;
            if (arr[mid] == target){
                return(mid);
            }
            else if(target>arr[mid]){
                i = mid+1;
            }else if(target<arr[mid]){
                j = mid-1;
            }
            System.out.println("working");
        }
        return -1;
    }


}