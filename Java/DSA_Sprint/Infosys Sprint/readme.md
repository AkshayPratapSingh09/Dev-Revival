# Wipro Training Notes (30th December)

This document contains notes, code examples, and implemented assignments for the topics covered during the training session on December 30th. Topics include Threading, Stacks, Queues, Lists, and Dictionaries in C#.

## 1. Threading in C#

Threading allows concurrent execution of code.

### Necessary Namespaces
```csharp
using System;
using System.Threading;
```

## 2. Thread Example: Worker Method with Sleep

This example demonstrates creating a secondary thread that pauses for 2 seconds before completing.

### Code
```csharp
using System;
using System.Threading;

class Program
{
    static void Work()
    {
        Thread.Sleep(2000); // Pauses the thread for 2000 milliseconds
        Console.WriteLine("Worker thread finished");
    }

    static void Main()
    {
        Thread t = new Thread(Work);
        t.Start();

        Console.WriteLine("Main thread finished");
    }
}
```

### Expected Output
```text
Main thread finished
Worker thread finished
```
*(Note: The order might vary slightly depending on system scheduling, but Main usually finishes first due to the sleep in Work)*

## 3. Thread Example: Printing Numbers

This example runs a method on a separate thread to print numbers from 1 to 5.

### Code
```csharp
using System;
using System.Threading;

class Program
{
    static void Main()
    {
        Thread t = new Thread(PrintNumbers);
        t.Start();

        Console.WriteLine("Main thread finished");
    }

    static void PrintNumbers()
    {
        for (int i = 1; i <= 5; i++)
        {
            Console.WriteLine(i);
        }
    }
}
```

### Expected Output
```text
Main thread finished
1
2
3
4
5
```

## 4. Stack

A Stack follows the LIFO (Last In, First Out) principle.

### Classroom Implementation Example
This is the example provided during the session.

```csharp
using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        Stack<int> stack = new Stack<int>();

        // Concept: Browser history (Google -> Amazon -> etc.)

        // Add Items
        stack.Push(10);
        stack.Push(20);
        stack.Push(30);

        // Remove Items
        int removed = stack.Pop();
        Console.WriteLine(removed);

        int top = stack.Peek();

        int count = stack.Count;

        foreach (int item in stack)
        {
            Console.WriteLine(item);
        }
    }
}
```

### Stack Assignments & Solutions

The following code implements the assigned exercises:
1. Create a stack of integers, push 5 numbers, and print all elements.
2. Pop the top element and display remaining.
3. Peek the top element.
4. Check if empty before popping.
5. Reverse a string using a stack.

```csharp
using System;
using System.Collections.Generic;

class StackAssignments
{
    static void Main()
    {
        Stack<int> stack = new Stack<int>();

        // 1. Push 5 numbers
        stack.Push(10);
        stack.Push(20);
        stack.Push(30);
        stack.Push(40);
        stack.Push(50);

        Console.WriteLine("All elements:");
        foreach (var item in stack) Console.WriteLine(item);

        // 2. Pop top element
        Console.WriteLine($"Popped: {stack.Pop()}");
        Console.WriteLine("Remaining:");
        foreach (var item in stack) Console.WriteLine(item);

        // 3. Peek top element
        Console.WriteLine($"Peek: {stack.Peek()}");

        // 4. Check empty before pop
        if (stack.Count > 0)
        {
            stack.Pop(); 
            Console.WriteLine("Popped safely.");
        }
        else
        {
            Console.WriteLine("Stack is empty.");
        }

        // 5. Reverse a string
        string input = "Training";
        Stack<char> chars = new Stack<char>();
        foreach (char c in input) chars.Push(c);

        Console.Write("Reversed String: ");
        while (chars.Count > 0)
        {
            Console.Write(chars.Pop());
        }
        Console.WriteLine();
    }
}
```

### Expected Output
```text
All elements:
50
40
30
20
10
Popped: 50
Remaining:
40
30
20
10
Peek: 40
Popped safely.
Reversed String: gniniarT
```

## 5. Queue

A Queue follows the FIFO (First In, First Out) principle.

### Classroom Implementation Example

```csharp
using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        Queue<int> queue = new Queue<int>();

        // Add items
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);

        // Remove items
        int removed = queue.Dequeue();

        // Peek (read only)
        int front = queue.Peek();

        int count = queue.Count;

        foreach (int item in queue)
        {
            Console.WriteLine(item);
        }
    }
}
```

### Queue Assignments & Solutions

The following code implements the assigned exercises:
1. Create a queue, enqueue 5 numbers, print all.
2. Dequeue two elements, print remaining.
3. Peek front element.
4. Check empty before dequeue.
5. Simulate printer queue.

```csharp
using System;
using System.Collections.Generic;

class QueueAssignments
{
    static void Main()
    {
        Queue<int> q = new Queue<int>();

        // 1. Enqueue 5 numbers
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);

        Console.WriteLine("All elements:");
        foreach (var item in q) Console.WriteLine(item);

        // 2. Dequeue two elements
        q.Dequeue();
        q.Dequeue();
        Console.WriteLine("Remaining after dequeueing two:");
        foreach (var item in q) Console.WriteLine(item);

        // 3. Peek front
        Console.WriteLine($"Front: {q.Peek()}");

        // 4. Check empty before dequeue
        if (q.Count > 0)
        {
            q.Dequeue();
            Console.WriteLine("Dequeued safely.");
        }

        // 5. Printer Queue Simulation
        Queue<string> printer = new Queue<string>();
        printer.Enqueue("Report.pdf");
        printer.Enqueue("Invoice.docx");
        printer.Enqueue("Photo.jpg");

        Console.WriteLine("\nPrinter Processing:");
        while (printer.Count > 0)
        {
            Console.WriteLine($"Printing: {printer.Dequeue()}");
        }
    }
}
```

### Expected Output
```text
All elements:
1
2
3
4
5
Remaining after dequeueing two:
3
4
5
Front: 3
Dequeued safely.

Printer Processing:
Printing: Report.pdf
Printing: Invoice.docx
Printing: Photo.jpg
```

## 6. List Exercises

Dynamic arrays that can resize automatically.

### Assignments & Solutions

1. Print numbers divisible by 3.
2. Remove duplicates.
3. Find largest and smallest without built-in methods.

```csharp
using System;
using System.Collections.Generic;

class ListAssignments
{
    static void Main()
    {
        // 1. Divisible by 3
        List<int> numbers = new List<int> { 5, 9, 12, 7, 18, 22 };
        Console.WriteLine("Numbers divisible by 3:");
        foreach (int n in numbers)
        {
            if (n % 3 == 0) Console.WriteLine(n);
        }

        // 2. Remove duplicates
        List<int> withDups = new List<int> { 1, 2, 2, 3, 4, 4, 5 };
        List<int> unique = new List<int>();
        foreach (int n in withDups)
        {
            if (!unique.Contains(n)) unique.Add(n);
        }
        Console.WriteLine("\nUnique List:");
        foreach (int n in unique) Console.Write(n + " ");
        Console.WriteLine();

        // 3. Find Largest and Smallest (Manual)
        List<int> values = new List<int> { 45, 12, 89, 5, 23 };
        int min = values[0];
        int max = values[0];

        foreach (int n in values)
        {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        Console.WriteLine($"\nSmallest: {min}, Largest: {max}");
    }
}
```

### Expected Output
```text
Numbers divisible by 3:
9
12
18

Unique List:
1 2 3 4 5

Smallest: 5, Largest: 89
```

## 7. Dictionary Exercises

Key-value pairs for fast lookups.

### Assignments & Solutions

1. Total price calculation.
2. Student with highest marks.
3. Character frequency count.

```csharp
using System;
using System.Collections.Generic;

class DictionaryAssignments
{
    static void Main()
    {
        // 1. Total Price
        Dictionary<int, double> products = new Dictionary<int, double>
        {
            { 101, 10.50 }, { 102, 20.00 }, { 103, 5.75 }
        };
        double total = 0;
        foreach (var p in products) total += p.Value;
        Console.WriteLine($"Total Price: {total}");

        // 2. Student with Highest Marks
        Dictionary<string, int> students = new Dictionary<string, int>
        {
            { "Amit", 85 }, { "Priya", 92 }, { "Rahul", 78 }
        };
        string topStudent = "";
        int maxMarks = -1;

        foreach (var s in students)
        {
            if (s.Value > maxMarks)
            {
                maxMarks = s.Value;
                topStudent = s.Key;
            }
        }
        Console.WriteLine($"Top Student: {topStudent} ({maxMarks})");

        // 3. Character Frequency
        string text = "bananas";
        Dictionary<char, int> freqs = new Dictionary<char, int>();

        foreach (char c in text)
        {
            if (freqs.ContainsKey(c)) freqs[c]++;
            else freqs[c] = 1;
        }

        Console.WriteLine("\nCharacter Frequencies:");
        foreach (var pair in freqs)
        {
            Console.WriteLine($"'{pair.Key}': {pair.Value}");
        }
    }
}
```

### Expected Output
```text
Total Price: 36.25
Top Student: Priya (92)

Character Frequencies:
'b': 1
'a': 3
'n': 2
's': 1
```
