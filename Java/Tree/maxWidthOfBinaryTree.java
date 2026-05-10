import java.util.*;

public class maxWidthOfBinaryTree {

    public static void main(String args[]) {

        TreeNode root = new TreeNode(1);
        root.addLeftChild(3);
        root.addRightChild(2);
        root.left.addLeftChild(5);
        root.left.addRightChild(3);
        root.right.addRightChild(9);
        System.out.println(printLevelOrderTree(root));

    }

    public static int widthOfBinaryTree(TreeNode root) {
        return 0;
    }

    public static ArrayList<Integer> printLevelOrderTree(TreeNode root) {
        if (root == null)
            return null;

        ArrayList<Integer> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        arr.add(root.value);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr.left != null) {
                arr.add(curr.left.value);
                q.offer(curr.left);
            }
            if (curr.right != null){
                arr.add(curr.right.value);
                q.offer(curr.right);
            }
        }

        return arr;
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }

    public void addLeftChild(int val) {
        if (this.left == null) {
            TreeNode curr = new TreeNode(val);
            this.left = curr;
        }
    }

    public void addRightChild(int val) {
        if (this.right == null) {
            TreeNode curr = new TreeNode(val);
            this.right = curr;
        }
    }
}