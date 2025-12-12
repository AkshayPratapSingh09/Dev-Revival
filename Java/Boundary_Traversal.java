import java.util.*;

public class Boundary_Traversal {
public static void main(String[] args) {
    System.out.println();
}

 ArrayList<Integer> ans = new ArrayList<Integer>(); 


 ArrayList<Integer> Traversal(TreeNode root, ArrayList<Integer> ans){
    if(root.left == null && root.right==null){
        ans.add(root.data);
      //  return ans;
    }
    return ans;
}
}