import java.util.Scanner;

class Node {
    public int data;
    Node left;
    Node right;

    public Node(int key) {
        data = key;
        left = null;
        right = null;
    }

    public void printData() {
        System.out.println(data);
        System.out.println(left);
        System.out.println(right);
    }

}

public class tree {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    //  static void Preorder(Node root) {
    //     if (root == null) {
    //         return;
    //     }
    //     System.err.print(root.data);
    //     Preorder(root.left);
    //     Preorder(root.right);
    // }

    static Node createTree() {

        System.out.print("Enter data: ");
        int data = sc.nextInt();

        if (data == -1)
            return null;

        Node root = new Node(data);
        System.out.print("Enter left for: " + data);
        root.left = createTree();
        System.out.print("Enter right for: " + data);
        root.right = createTree();

        return root;

    }


    }
}