
---

# Cognizant Interview Questions & Answers

This section covers interview questions recently asked at Cognizant, including Coding, SQL, and Core Java concepts.

## 1. Coding Problems

### **1. Find the 3rd Largest Number in an Array (Without Built-in Functions)**
**Layman Explanation:**  
Imagine you are judging a race. You don't need to sort every single runner to find the bronze medalist. You just need to keep track of the top 3 runners you've seen so far as they cross the finish line.

**Code:**
```java
public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 16};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second && n != first) {
                third = second;
                second = n;
            } else if (n > third && n != second && n != first) {
                third = n;
            }
        }
        System.out.println("3rd Largest: " + third);
    }
}
```

### **2. SQL Query: Age > 40 and Name starts with 'A'**
**Layman Explanation:**  
Asking the database: "Show me the list of people who are older than 40 AND whose name begins with the letter A."

**Query:**
```sql
SELECT * FROM Employees 
WHERE age > 40 AND name LIKE 'A%';
```

### **3. Palindrome (String or Number)**
**Layman Explanation:**  
A palindrome is something that reads the same forwards and backwards, like "MOM" or "121". It's like looking in a mirror.

**Code (String):**
```java
String str = "madam";
String rev = "";
for (int i = str.length() - 1; i >= 0; i--) {
    rev += str.charAt(i);
}
if (str.equals(rev)) System.out.println("Palindrome");
```

### **4. Armstrong Number**
**Layman Explanation:**  
A number is Armstrong if the sum of its own digits each raised to the power of the number of digits equals the number itself.  
Example: 153 (3 digits) -> 1³ + 5³ + 3³ = 1 + 125 + 27 = 153.

**Code:**
```java
int num = 153, sum = 0, temp = num;
while (temp > 0) {
    int digit = temp % 10;
    sum += digit * digit * digit; // Assuming 3 digit number for simplicity
    temp /= 10;
}
if (sum == num) System.out.println("Armstrong");
```

### **5. Anagram**
**Layman Explanation:**  
Two words are anagrams if they use the exact same letters in a different order. Like "Listen" and "Silent".

**Code:**
```java
String s1 = "Listen", s2 = "Silent";
char[] c1 = s1.toLowerCase().toCharArray();
char[] c2 = s2.toLowerCase().toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
System.out.println(Arrays.equals(c1, c2) ? "Anagram" : "Not Anagram");
```

### **6. Reverse of a String**
**Layman Explanation:**  
Writing a word backwards. "Java" becomes "avaJ".

**Code:**
```java
String str = "Hello";
StringBuilder sb = new StringBuilder(str);
System.out.println(sb.reverse());
```

### **7. Frequency of Characters in a String**
**Layman Explanation:**  
Counting how many times each letter appears. In "Apple", 'p' appears 2 times.

**Code:**
```java
String str = "banana";
HashMap<Character, Integer> map = new HashMap<>();
for (char c : str.toCharArray()) {
    map.put(c, map.getOrDefault(c, 0) + 1);
}
System.out.println(map);
```

### **8. Move All Zeros to End**
**Layman Explanation:**  
Pushing all the empty boxes (zeros) to the back of the line while keeping the full boxes (numbers) in their original order.

**Code:**
```java
int[] arr = {1, 0, 2, 0, 3};
int count = 0;
for (int i : arr) {
    if (i != 0) arr[count++] = i;
}
while (count < arr.length) arr[count++] = 0;
```

### **9. Reverse an Array**
**Layman Explanation:**  
Flipping the list. First becomes last, last becomes first.

**Code:**
```java
int[] arr = {1, 2, 3, 4, 5};
for(int i=0; i<arr.length/2; i++){
    int temp = arr[i];
    arr[i] = arr[arr.length -1 -i];
    arr[arr.length -1 -i] = temp;
}
```

### **10. Second Largest Element**
**Layman Explanation:**  
Finding the Silver medalist. The one who is largest, but smaller than the absolute maximum.

**Code:**
```java
// Similar logic to 3rd largest, just track two variables
```

### **11. Sum of Elements**
**Layman Explanation:**  
Adding up all the numbers in your grocery bill.

**Code:**
```java
int sum = 0;
for(int n : arr) sum += n;
```

### **12. Prime Number**
**Layman Explanation:**  
A number that hates company. It can only be divided by 1 and itself (e.g., 7, 13).

**Code:**
```java
int num = 29;
boolean isPrime = true;
for(int i=2; i<=num/2; i++) {
    if(num % i == 0) { isPrime = false; break; }
}
```

### **13. Even / Odd**
**Layman Explanation:**  
Even numbers can be paired up perfectly (divisible by 2). Odd numbers always have one left over.

**Code:**
```java
if (num % 2 == 0) System.out.println("Even");
```

### **14. Factorial / Fibonacci**
**Layman Explanation:**  
**Factorial:** 5! = 5*4*3*2*1. Multiplying down to 1.  
**Fibonacci:** Adding the last two numbers to get the next one. 0, 1, 1, 2, 3, 5...

**Code (Factorial):**
```java
int fact = 1;
for(int i=1; i<=5; i++) fact *= i;
```

---

## 2. Core Java & OOPS Concepts

### **1. What is OOPS?**
**Answer:** Object-Oriented Programming (OOP) is a programming style based on "objects" that contain data and code.  
**Layman Explanation:** Think of it like a car factory. You have blueprints (Classes), giving you the design. You create actual Cars (Objects) from them. The 4 pillars are:
1. **Inheritance:** Passing traits from parent to child (like you got your eyes from your dad).
2. **Polymorphism:** One thing, many forms (like a person is a father, an employee, and a husband).
3. **Encapsulation:** Hiding sensitive data (like a capsule enclosing medicine).
4. **Abstraction:** Hiding complex details (you drive a car with a key, you don't need to know how the engine works).

### **2. Final Keyword**
**Answer:** Used to restrict the user.
*   **Variable:** Constant (cannot change value).
*   **Method:** Cannot be overridden.
*   **Class:** Cannot be inherited.
**Layman Explanation:** "Final" means "This is it." Writing in permanent marker. You can't erase or change it later.

### **3. Throw vs Throws**
**Answer:**
*   `throw`: Used to explicitly throw an exception.
*   `throws`: Used in method signature to declare that this method *might* throw an exception.
**Layman Explanation:**
*   **Throw:** You actually throwing the ball (error) at someone.
*   **Throws:** Putting a sign on the door saying "Warning: Balls might be thrown in here."

### **4. Exception Handling**
**Answer:** Mechanism to handle runtime errors (Try-Catch-Finally).
**Layman Explanation:** It's a safety net. If you try to walk on a tightrope (`try`) and fall (`catch exception`), the net catches you so the show doesn't stop (program doesn't crash).

### **5. Function Overloading vs Overriding**
**Answer:**
*   **Overloading:** Same method name, different parameters (Compile-time polymorphism).
*   **Overriding:** Same method name, same parameters in Parent and Child class (Runtime polymorphism).
**Layman Explanation:**
*   **Overloading:** A helper who can "clean(room)" OR "clean(car)". Same action name, different target.
*   **Overriding:** Your dad has a method "drive()", but you learn to "drive()" differently (faster/drift). You replaced his way with yours.

### **6. JDBC (Java Database Connectivity)**
**Answer:** API to connect Java applications with specific Databases.
**Layman Explanation:** It's the bridge or translator that lets your Java code talk to a Database (like SQL).

### **7. Collection Framework**
**Answer:** A set of classes and interfaces (List, Set, Queue, Map) to store and manipulate groups of objects.
**Layman Explanation:** A toolbox of containers. Do you need a grocey bag (List), a unique stamp collection (Set), or a Dictionary (Map)? Java gives you these ready-made containers.

### **8. Spring Boot**
**Answer:** A framework to build stand-alone, production-grade Spring applications with minimal configuration.
**Layman Explanation:** If "Spring" is building a car from parts, "Spring Boot" is buying a pre-assembled car where you just start the engine. It handles all the boring setup for you.

### **9. Interface vs Class**
**Answer:**
*   **Class:** Can be instantiated, holds state and behavior.
*   **Interface:** Blueprint of a class. 100% abstract (before Java 8). Cannot have state.
**Layman Explanation:**
*   **Class:** A real house you can live in.
*   **Interface:** A strict contract for an architect. "The house MUST have a door and windows." It doesn't build the house, it just sets the rules.

### **10. Why is String Immutable?**
**Answer:** For Security, Synchronization, and Caching (String Pool).
**Layman Explanation:** Imagine if "Password123" could be changed to "Hack123" in memory while you were logging in. Java makes Strings unchangeable to prevent this kind of tampering.

### **11. Abstract Method**
**Answer:** A method without a body.
**Layman Explanation:** A to-do list item like "Do Homework". It tells you *what* to do, but not *how* to do it. The child class must define the *how*.

### **12. Public Static Void Main**
**Answer:** Entry point of the program.
*   `Public`: Accessible everywhere.
*   `Static`: Call without creating an object.
*   `Void`: Returns nothing.
*   `Main`: The name JVM looks for.
**Layman Explanation:** The "Start Button" of the program. It has to be public (so JVM sees it) and static (so JVM can push it without asking permission/creating an object first).

### **13. Java Platform Independence**
**Answer:** "Write Once, Run Anywhere". Java compiles to Bytecode, which runs on JRE/JVM, not directly on the OS.
**Layman Explanation:** Java speaks a universal language (Bytecode) that a translator (JVM) on every computer understands. So you write code once, and it works on Mac, Windows, and Linux.

### **14. Advantages of Java**
**Answer:** Platform independent, Object-oriented, Secure, Robust, Multithreaded.
**Layman Explanation:** It works everywhere, it organizes code like real-life objects, it's safe (hard to crash memory), and it can do multiple things at once.
