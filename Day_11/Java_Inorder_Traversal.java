import java.util.Scanner;

class Node{
    public int data;
    public Node left;
    public Node right;

    public Node(int key){
     data = key;
     left = null;
     left = null;
    }

}

public class Java_Inorder_Traversal {

    public static void Preorder(Node root){
        if (root==null){
            return;
        }
        System.err.println(root.data);
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void Inorder(Node root){
        if (root==null){
            return;
        }
        Preorder(root.left);
        System.err.println(root.data);
        Preorder(root.right);
    }

    public static void Postorder(Node root){
        if (root==null){
            return;
        }
        Preorder(root.left);
        Preorder(root.right);
        System.err.println(root.data);
    }
    // public static void Levelorder(Node root){
    //     if (root==null){
    //         return;
    //     }
    //     Preorder(root.left);
    //     Preorder(root.right);
    //     System.err.println(root.data);
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.err.println("Enter Data: ");
        int data = sc.nextInt();
        // if (data== -1) return null;

        Node root = new Node(data);
        
        // Node a = new Node(10);
        // Node b = new Node(20);
        // Node c = new Node(30);
        // Node d = new Node(40);
        // Node e = new Node(50);
        // Node f = new Node(60);
        // a.left = b;
        // a.right = c;
        // b.left = d;
        // b.right = e;
        // c.left = f;

        Inorder(a);

        
    }
}
