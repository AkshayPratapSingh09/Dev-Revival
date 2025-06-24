class LinkNode{

    int data;
    LinkNode next;
    
    public LinkNode(int num){
        this.data = num;
        this.next = null;
    }
}


public class Solution{
    public static void main(String[] args) {
        LinkNode a = new LinkNode(10);
        LinkNode b = new LinkNode(20);
        LinkNode c = new LinkNode(30);
        LinkNode d = new LinkNode(40);

        a.next = b;
        b.next = c;
        c.next = d;
        addElementMid(50, a);

        parseLL(a);
        // System.out.println(parseLL(a););

    }

    public static void addElementMid(int num, LinkNode head){
        LinkNode newNode = new LinkNode(num);
        int len = 0;

        LinkNode par = head;
        while(par != null){
            len +=1;
            par = par.next;
        }

        
        int idx = 0;
        while(head != null && idx < len/2-1){
            idx +=1;
            head = head.next;
        }
        LinkNode temp = head.next;
        head.next = newNode;
        newNode.next = temp;


    }
    public static void parseLL(LinkNode head){
        if(head == null){
            return;
        }

        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }

    }
}