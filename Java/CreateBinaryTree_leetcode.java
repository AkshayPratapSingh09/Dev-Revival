import java.util.*;

public class CreateBinaryTree_leetcode {
public static void main(String[] args) {
    int[][] desc = {{1,2,3},{4,5,6},{7,8,9}};
    CreateBinaryTree(desc);
    
}

static TreeNode CreateBinaryTree(int[][] desc){
    HashSet<Integer> set = new HashSet<>();
    HashMap<Integer, TreeNode> map = new HashMap<>();

    for(int d[] : desc){
        TreeNode par = new TreeNode(d[0]);

        // Parent Node
        if(!map.containsKey(d[0])){
            map.put(d[0],new TreeNode(d[0]));
        }
        
        if(!map.containsKey(d[1])){
            map.put(d[1],new TreeNode(d[1]));
        }
        if(d[2] == 1){
            map.get(d[0]).left = map.get(d[1]);
        }
        else{
            map.get(d[0]).right = map.get(d[1]);
        }
        // Node 
        set.add(d[1]);
    }

    for(int d[] : desc){
        if(!set.contains(d[0])){
            return map.get(d[0]);
        }
    }
} 

}


class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
