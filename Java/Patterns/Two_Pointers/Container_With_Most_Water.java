import java.util.HashSet;
import java.util.*;

public class Container_With_Most_Water {
    
    public static void main(String[] args) {
        int nums[] = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(nums);
        System.out.println(ans);
        
    }
    public static int maxArea(int[] height) {
        int maxWater = 0;

        int i=0;
        int j= height.length-1;

        while(i<j){
            int width = j-i;
            int h = Math.min(height[i],height[j]);
            int currWater = width * h;
            maxWater = Math.max(maxWater,currWater);

            if(h == height[i]){
                i++;
            } else{
                j--;
            }
        }
        return maxWater;
    }
}
