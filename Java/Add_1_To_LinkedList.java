//     Test Cases Passed: 
// 10 /1116
// For Input: 
// 9 9 9
// Your Code's output is: 
// 9910
// It's Correct output is: 
// 1000
// Output Difference
// 99101000

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
        }
        }
        
class LinkNode{
    int data;
    LinkNode next;
    
    LinkNode(int x){
        data = x;
        next = null;
        }
        }
        
            public class Add_1_To_LinkedList {
            
            public LinkNode addOne(LinkNode head) {
                if (head == null){
                    LinkNode f = new LinkNode(1);
                    head = f;
                    return head;
                }
                
                LinkNode par = head;
                while (par.next != null){
                    par = par.next;
        }
        par.data +=1;
     return head;   
    }
}
