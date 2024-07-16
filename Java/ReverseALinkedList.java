import java.util.*;

public class ReverseALinkedList {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(60);
        ListNode g = new ListNode(70);
        a.next = a;
        // b.next = c;
        // c.next = b;
        // c.next = d;
        // d.next = e;
        // e.next = f;
        // f.next = g;

        // printLinkedList(a);
        // ListNode revHead = reverseLinkedList(a);
        // printLinkedList(revHead);
        // System.out.println(isPalindrome(a));
        System.out.println(DetectCycle(a));

    }

    static void printLinkedList(ListNode root) {
        if (root == null) {
            return;
        }
        while (root != null) {
            System.out.print(root.data + " ");
            root = root.next;
        }
        System.out.println();
    }

    static ListNode reverseLinkedList(ListNode root) {
        if (root == null) {
            return null;
        }

        ListNode prev = null;
        ListNode curr = root;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;

            prev = curr;
            curr = temp;
        }
        return prev;

    }

    static Boolean isPalindrome(ListNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            return true;
        }
        while (root != null) {
            // System.out.print(root.data + " ");
            sb.append(root.data + "");
            root = root.next;
        }
        System.out.println(sb.toString());
        System.out.println(sb.reverse().toString());
        return sb.toString().equals(sb.reverse().toString());
    }

    static Boolean DetectCycle(ListNode root) {
        if (root == null) {
            return false;
        }
        ListNode slow = root;
        ListNode fast = root;

        while (slow != null || fast != null) {

            if (slow.next == null || fast.next == null) {
                return false;
            }

            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
            slow = slow.next;
        }
        return false;
    }
}

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}