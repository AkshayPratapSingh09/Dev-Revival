import java.util.*;

public class ActivitySelection {

    public static void main(String[] args) {
        int[] start = {0,3,1,8,5,5};
        int[] end = {6,4,2,9,7,9};

        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        ArrayList<Integer> startArr = new ArrayList<>();
        ArrayList<Integer> endArr = new ArrayList<>();
        
        for(int i=0; i<start.length;i++){
            startArr.add(start[i]);
            endArr.add(end[i]);
        }
        
        for(int i=0; i<start.length;i++){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(startArr.get(i));
        temp.add(endArr.get(i));
        pairs.add(temp);
        }

        // Collection.sort()


        // in this questions we have the pairs of task which takes days (start[i],end[i])
        //  For next task we need to ask for another interval 
        // For eg. if we pick 
        // (0, 6) -> First task    //Now we need to take the next start greater than the last end ie. end>6
        // (8,9)  will be the next task according to this
        // and in this way we will only be able to complete only 2 tasks which is not the most tasks (ans)

        // Expected answer  (4 tasks)
        // first task -> (1,2) 
        // second task -> (3,4)  start > first task end
        // third task -> (5,7)   start > second task end
        // fourth task -> (8,9)  start > third task end


        // Approach
        //  1. we will make the pairs of timeline of task
        // eg. [ [0,6] [3,4] [1,2] [8,9] [5,7] 5,9]
        // 2. Now we will sort this array according to the end time using comparator in java 
    }

    public static void solve(int[] arr){
        
    }
}