import java.util.*;

class CustomNode{
    TreeNode node;
    int col;
    CustomNode(TreeNode node, int col){
        this.node = node;
        this.col = col;
    }
}

public class Trial_DS {
    public static void main(String[] args) {
        Queue<CustomNode> queue = new LinkedList<CustomNode>();
        queue.add(new CustomNode(null, 0));
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
