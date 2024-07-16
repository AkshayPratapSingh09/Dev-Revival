import java.util.*;

public class BinaryTree {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(30);
        TreeNode d = new TreeNode(40);
        TreeNode e = new TreeNode(50);
        TreeNode f = new TreeNode(60);
        TreeNode g = new TreeNode(70);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        List<List<Integer>> arr =  betterlevelOrder(a);
        System.out.println(arr);
        // CurrlevelOrder(a, 3);
    }

    static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.left);
    }

    static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.left);
        System.out.println(root.data);
    }

    static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        System.out.println(root.data);
        preOrder(root.left);
    }

    static void CurrlevelOrder(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        }
        if (level > 1) {
            CurrlevelOrder(root.left, level - 1);
            CurrlevelOrder(root.right, level - 1);
        }
    }

    static void levelOrder(TreeNode root, int height) {
        for (int i = 0; i <= height; i++) {
            CurrlevelOrder(root, i);
            System.out.println();
        }
    }

    static int heightTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(heightTree(root.left) + 1, heightTree(root.right));
    }

    static List<List<Integer>> betterlevelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
        
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.data);

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            ans.add(level);
        }
        return ans;
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
