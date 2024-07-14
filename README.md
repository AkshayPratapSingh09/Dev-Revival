# DSA Daily Practice From Different Sources 
- Arrays
- LinkedList
- Graphs
- Queue/Stacks


# Stack Data Structure 

- LIFO
- Main Operations -> Push, Pop , Peek
- Push -> add value on top
- Pop -> remove from top
- peek -> retrieve top element
- isEmpty() -> Check if the stack is isEmpty
- size() -> Returns the current size of Stack

## Using LinkedList
```
package DSA;

public class Stack_Using_LinkedList {

    public static void main(String args[]) {
        
        myOtherStack stack = new myOtherStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        System.out.println("Top element is " + stack.peek());

        System.out.println(stack.pop() + " popped from stack");

        stack.printStack();
        
    }
    
}

class myOtherStack {
     treeNode head;
     int size; 
    
    public myOtherStack() {
        head = null;
        size = 0;
    }
    
    void push(int data) {
    	
    	treeNode temp = new treeNode(data);
    	
    	if (head == null) {
    		head = temp;
    		head.next = null;
    	}
    	else {
        temp.next = head;
    	}
        size++;
        head = temp;
    }
    
    int peek() {
        if (head == null) {
            System.out.println("Empty");
            return -1;
        }
        else {
            return head.data;
        }
    }
    
    int pop() {
        if (head == null) {
            System.out.println("Empty");
            return -1;
        }
        else {
            int res = head.data;
            head = head.next;
            size--;
            return res;
        }
    }
    
    boolean isEmpty() {
        return head == null;
    }
    
    int size() {
        return size;
    }
    
    void printStack() {
        treeNode current = head;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    class treeNode {
        int data;
        treeNode next;
        
        public treeNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

```

## Using Array
```
package DSA;
import java.util.*;

public class Stack_Using_Array {

	public static void main(String args[]) {
//		Main Operations--> Push Pop Peek isEmpty() Size()
		
		myStack stack = new myStack(10);
		stack.push(50);
		stack.push(20);
		stack.push(40);
		stack.push(10);
		System.out.println(Arrays.toString(stack.currentStack()));
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(Arrays.toString(stack.currentStack()));
		System.out.println(stack.peek());
		
	}
}

class myStack{
	int a[];
	int top;
	int capacity;
	
	public myStack(int capacity) {
		this.capacity = capacity;
		top = -1;
		a = new int[capacity];
	}
	
	void push(int data) {
		if(top==capacity-1) {
			throw new StackOverflowError("Already Full ");
		}
		top++;
		a[top] = data;
	}
	
	int pop() {
		if (top==-1) {
//			throw new Exception();
			System.out.println("No element");
			return -1;
			}
		else {
		int res = a[top];
		top--;
		return res;
		}
	}
	
	int peek() {
		if (top==-1) {
			System.out.println("No element");
			return -1;
		}
		else {
			return a[top];
		}
	}
	
	boolean isEmpty() {
		return top ==-1;
	}
	
	int[] currentStack() {
		return a;
	}
//	
}

```
## Using Builtin class

```
package DSA;
import java.util.Stack;


public class Stack_Using_Builtin_Class {
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.pop();
//		while(!s.empty()) {
//			System.out.println(s.peek());
//			s.pop();
//		}
		System.out.println(s.size());
	}
	
}
```


## String in java

- Length : `a.length()`
- (Slicing) getSubstring : `a.substring(i,i+1)`
- Adding two Strings : `ans = ans.concat(String2)`


```
String s = "This is good";
int l = a.length();

for (int i =0; i<a.length(); i++){

System.out.println(a.substring(i,i+1));

}
```
- Reverse a String: 
```
static public String reverseString(String a){
        String ans = "";
        int l = a.length();
        
        for (int i =0; i<a.length(); i++){
            ans = ans.concat(a.substring(l-i-1,l-i));
        }
        return ans;
        }
```

## Array Implementation

- Dynamic Array : `List<> list = new ArrayList<>();` 
- Add Element : `list.add("First");`;
- Remove by Index : `list.remove(0);`
- Remove the last element : `list.removeLast();`
```
List<> list = new ArrayList<>();

list.add("First");
list.add("Second");
list.add("Third");
list.add("Fourth");
list.add("Fifth");


System.out.println("Size of Array:"+list.size());
		
		for (int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

list.set(3, "THird") ;

list.remove(0);
list.removeLast();

		
```


## Maths 

- Max Value : `Math.max(a,b)`
- Min Value : `Math.min(a,b)`
- Absolute(Positive) :`Math.abs(a,b)`
- Before Decimal : `Math.floor(a,b)`
- Ceil Value(Upper) : `Math.ceil(a,b)`

