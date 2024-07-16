public class Largest {
    public static void main(String[] args) {
        int[] arr = {8,7,9,13,11,3,2};
        int largest = 0;
        int secondLargest = 0;

        for (int i=0;i<arr.length-1;i++){
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
    } 
    else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
    }
        }
        System.out.printf("%d %d",largest,secondLargest);

    }
}
