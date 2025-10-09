import java.util.*;

public class ActivitySelection {

    public static void main(String[] args) {
        int[] start = {0,3,1,8,5,5};
        int[] finish = {6,4,2,9,7,9};

        ArrayList<Integer> startArr = new ArrayList<>();
        ArrayList<Integer> endArr = new ArrayList<>();
        ArrayList<Integer> indexArr = new ArrayList<>();
        
        for(int i=0; i<start.length;i++){
            startArr.add(start[i]);
            endArr.add(finish[i]);
            indexArr.add(i);
        }
        // Collection.sort()

        Collections.sort( indexArr, (a,b) -> (finish[a] - finish[b]));
        System.out.println(indexArr);  // [2,1,0,4,3,5]

        int maxAcitivty = 1;
        int lastEnd = finish[indexArr.get(0)];

        for (int i=1; i<start.length; i++){
            int index = indexArr.get(i);
            if(start[index] > lastEnd){
                maxAcitivty++;
                lastEnd = finish[index];
            }
        }

        System.out.println(maxAcitivty);

        //[ [1,2] [3,4] [0,6] [5,7] [8,9] [5,9] ]


        // in this questions we have the pairs of task which takes days (from -> start[i],  To ->end[i])
        //  For next task we need to ask for another interval 
        // For eg. if we pick 
        // (0, 6) -> First task    //Now we need to take the next start greater than the last end ie. nextTaxtStart > 6
        // (8,9)  will be the next task according to this
        // and in this way we will only be able to complete only 2 tasks which is not the most tasks (ans)

        // Expected answer  (4 tasks)
        // first task -> (1,2) 
        // second task -> (3,4)  start > first task end
        // third task -> (5,7)   start > second task end
        // fourth task -> (8,9)  start > third task end


        // Approach
        //  1. we will make the pairs of timeline of task (not in code but as in Mind)
        // eg. [ [0,6] [3,4] [1,2] [8,9] [5,7] 5,9]
        // 2. Now we will sort this Another index array (that will Act as indexes of those parallel pairs)
        // Sorting according to the end time(finish/last time containing array) using comparator in java 
        // It will make indexArr like it is the sorted indexes version of the pairs (acc. to last time)
        // In this case --> [2,1,0,4,3,5]

        // Now we will simply iterate acc. to the sorted indexArr of the pairs with counter
        // int count = 1  for the first pair (we will consider it already for the sake of finding bigger start)
        // And on finding the next pair with greater ending we will increment the counter

    }

}