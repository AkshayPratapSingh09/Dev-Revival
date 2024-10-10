import java.util.*;

public class n_Meeting_in_one_room {
    public static void main(String[] args) {
// Wrong solution
//         8
// 75250 50074 43659 8931 11273 27545 50879 77924
// 112960 114515 81825 93424 54316 35533 73383 160252
        int n = 3;
        int start[] = {10, 12, 20};
        int end[] =  {20, 25, 30};
        System.out.println(solve(n,start,end));
    }

    static int solve(int n, int start[], int end[]){
        int first = 0;
        int last = 0;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i=0; i<n;i++){
            ArrayList<Integer> curr = new ArrayList<>();
            if (start[i] > last && end[i] > last){
                curr.add(start[i]);
                curr.add(end[i]);
                arr.add(curr);
                first = start[i];
                last = end[i];
            }
        }
        // System.out.println(arr);
        return arr.size();

        // return 0;
    }
}
