import java.util.*;

public class sortArrayList {
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(40);
        arr.add(20);
        arr.add(55);
        arr.add(656);
        arr.add(6);
        arr.add(11);
        arr.add(116);
        arr.add(16);

        System.out.println(arr);
        
        arr.sort(new Comparator<Integer>(){
            public int compare(Integer A,Integer B){
                return B-A;
            }
        });
        
        System.out.println("After Sorting\n");
        System.out.println(arr);
    }
}
