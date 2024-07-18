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
        // List<List<Integer>> arr =  betterlevelOrder(a);
        // System.out.println(arr);
        // CurrlevelOrder(a, 3);
        
        // TreeNode ans = FindLeastCommonAncestor(a, f, g);
        // System.out.println(ans.data);
        // System.out.println(diameterOfTree(a));
        // postOrder(a);
        // System.out.println(arr);
        // System.out.println(isBalancedTree(a));
        // System.out.println(finalFastBalancedTree(a));
        // List<TreeNode> r = new ArrayList<TreeNode>();
        // int[] first = {3,5};
        // HashMap<Integer, Boolean> third = new HashMap<>();
        // for(int second : first){
        //     third.put(second, true);
        // }
        // System.out.println(third.containsKey(e));
        
        levelOrder(a, height(a));
    }

    static void preOrder(TreeNode root, ArrayList arr) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        arr.add(root.data);
        preOrder(root.left, arr);
        preOrder(root.right, arr);
    }

    static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
        arr.add(root.data);
    }

    static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    // static ArrayList sol = new ArrayList<>();
    static ArrayList CurrlevelOrder(TreeNode root, int level, ArrayList sol) {
        
        if (root == null) {
            return sol;
        }
        if (level == 1) {
            sol.add(root.data);
            // System.out.print(root.data + " ");
        }
        if (level > 1) {
            CurrlevelOrder(root.left, level - 1,sol);
            CurrlevelOrder(root.right, level - 1,sol);
        }
        return sol;
    }
    // static void CurrlevelOrder(TreeNode root, int level) {
    //     if (root == null) {
    //         return;
    //     }
    //     if (level == 1) {
    //         System.out.print(root.data + " ");
    //     }
    //     if (level > 1) {
    //         CurrlevelOrder(root.left, level - 1);
    //         CurrlevelOrder(root.right, level - 1);
    //     }
    // }

    static void levelOrder(TreeNode root, int height) {
        List<ArrayList> res = new ArrayList<ArrayList>();
        for (int i = 1; i <= height; i++) {
            ArrayList sol = new ArrayList<>();
            sol = CurrlevelOrder(root, i,sol);
            // System.out.println(sol);
            // System.out.println(sol.reversed()); 
            if (i%2 == 0){  
                Collections.reverse(sol);
            }
            res.add(sol);
            // System.out.println();
        }
        System.out.println(res);
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
    
    static TreeNode FindLeastCommonAncestor(TreeNode root, TreeNode a, TreeNode b){
            if (root==null) return null;

            if (root == a || root == b) return root;
            TreeNode left = FindLeastCommonAncestor(root.left, a, b);
            TreeNode right = FindLeastCommonAncestor(root.right, a, b);

            if(left!=null && right != null) return root;

            return left != null ? left : right;

    }
    
    static int diameterOfTree(TreeNode root) {
        height(root);
        return ans;
    }
    
    static int ans=0;

    static int height(TreeNode root){
        if(root==null)return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        ans=Math.max(ans,rh+lh+1);
        return 1 + Math.max(lh,rh);
    }

    static Boolean isBalancedTree(TreeNode root){
        if(root==null) return true;
        return Math.abs(heightTree(root.left) - heightTree(root.right)) <=1 && isBalancedTree(root.left)
        && isBalancedTree(root.right);
    }
    
    static ArrayList res = new ArrayList<>();

    static ArrayList isBalancedFastTree(TreeNode root){
        if (root == null){
            res.add(true);
            res.add(0);
            return res;
        }
        ArrayList left = isBalancedFastTree(root.left);
        ArrayList right = isBalancedFastTree(root.right);

        boolean leftAns = (boolean) left.get(0);
        boolean rightAns = (boolean) right.get(0);

        boolean diff = Math.abs((int) left.get(1) - (int) right.get(1)) <=1;
        ArrayList ans = new ArrayList<>();  

        if (leftAns && rightAns && diff){
            ans.add(true);
        }
        else{
            ans.add(false);
        }

        ans.add(Math.max((int) left.get(1), (int) right.get(1)) + 1);

        return ans;
    }

    static boolean finalFastBalancedTree(TreeNode root){
        if(root== null) return true;
        return (boolean) isBalancedFastTree(root).get(0);
    }

    static Boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null  && q == null){
            return true;
        }
        if(p == null && q != null){
            return false;
        }
        if(p != null && q == null){
            return false;
        }

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        boolean val = (p.data == q.data);

        if(left && right && val){
            return true;
        }
        else{
            return false;
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
