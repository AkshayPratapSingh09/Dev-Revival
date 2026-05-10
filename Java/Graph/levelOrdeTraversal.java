import java.util.*;

public class levelOrdeTraversal {
    public static void main(String args[]){

    Node root = new Node(10);
    Node A = new Node(20);
    Node B = new Node(30);
    Node C = new Node(40);
    Node D = new Node(50);

    root.left = A;
    root.right = B;
    root.left.left = C;
    root.left.right = D;

    ArrayList<Integer> ans = new ArrayList<>();
    Queue<Node> q = new LinkedList<>();

    q.add(root);

    while(!q.isEmpty()){
        Node curr = q.poll();
        ans.add(curr.data);

        if(curr.left != null) q.add(curr.left);
        if(curr.right != null) q.add(curr.right);
    }

    System.out.println(ans);
    }
}


class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}