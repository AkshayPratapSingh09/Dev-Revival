import java.util.*;

public class AssignMiceHoles {
    public static void main(String[] args) {
        // int mices[] = {4, -4, 2};
        // int holes[] = {4, 0, 5};
        int mices[] = {1,2};
        int holes[] = {20,10};
        Arrays.sort(mices);
        Arrays.sort(holes);

        int n = mices.length;
        System.out.println(Arrays.toString(mices));
        System.out.println(Arrays.toString(holes));
        int ans = 0;

        for (int  i=0; i<n;i++){
            ans = Math.max(Math.abs(mices[i]-holes[i]), ans);
        }
        System.out.println(ans);

    }
}
