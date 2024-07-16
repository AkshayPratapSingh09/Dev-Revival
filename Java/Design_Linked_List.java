public class Design_Linked_List {
    public static void main(String[] args) {
        
    }
}

class MyLinkedList {

    LinkNode head;
    
    public MyLinkedList() {
        this.head = null;
    }
    
    public int get(int index) {
        int count = 1;
        if (head == null){
            return -1;
        }
        while (head!=null){
            if (count == index){
                return head.data;
            }
            head = head.next;
            count += 1;
        }
        return -1;
        
    }
    
    public void addAtHead(int val) {
        if (head != null){
           LinkNode newHead = new LinkNode(val); 
           newHead.next = head;
        }
        
    }
    
    public void addAtTail(int val) {
        LinkNode last = new LinkNode(val);
        if (head == null){
            head = last;
        }
        while(head!= null){
            head = head.next;
        }
        head.next = last;
    }
    
    public void addAtIndex(int index, int val) {
        int count = 1;
        if (head == null){
            return;
        }

        LinkNode prev = head;
        LinkNode added = new LinkNode(val);
        while (head!=null){
            if (count == index){
                prev.next = added;
                added.next = head.next;
            }
            prev = head;
            head = head.next;
            count += 1;
        }
        
    }
    
    
    public void deleteAtIndex(int index) {
        int count = 1;
        if (head == null|| index < 0){
            return;
        }
        if (index == 0) {  // Special case for deleting the head node
            head = head.next;
            return;
          }

        LinkNode prev = head;
        while (prev != null && count < index) {  // Iterate until reaching the node before target
            prev = prev.next;
            count++;
          }
        
          if (prev != null && prev.next != null) { 
            prev.next = prev.next.next;  
    }
}
}

class LinkNode{
    int data;
    LinkNode next;

    public LinkNode(int data){
        this.data = data;
        this.next = null;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */