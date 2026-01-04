import java.util.*;

public class trial {
    public static void main(String[] args) {
        int[] nums1 = { 2, 3 };
        int[] nums2 = { 3, 2 };
        System.out.println(Arrays.equals(nums1, nums2));

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<int[]> set = new HashSet();
        set.add(nums1);
        set.add(nums2);
        for (int[] i : set) {
            System.out.println(Arrays.toString(i));
        }
    }

}
