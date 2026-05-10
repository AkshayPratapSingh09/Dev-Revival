public class examples {

    // 1. FINAL VARIABLE: Value cannot be changed once assigned
    final int MAX_AGE = 100;
    
    // 2. STATIC VARIABLE: Belongs to the class, shared by all instances
    static String company = "Tech Corp";
    
    public static void main(String[] args) {
        examples obj = new examples();
        
        // Math.pow(10,);

        // obj.MAX_AGE = 55;

        // obj.MAX_AGE = 101; // ERROR: Cannot assign a value to final variable


        System.out.println("Final Variable: " + obj.MAX_AGE);

        System.out.println(company);

        // 3. FINALLY BLOCK: Always executes, whether exception occurs or not
        try {
            int data = 25 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed - Important for closing connections/files");
        }
    }


    // 4. FINALIZE METHOD: Called by Garbage Collector before object is destroyed
    // (Deprecated in newer Java versions but asked in interviews)
    @Override
    protected void finalize() {
        System.out.println("Object is being garbage collected");
    }
}

// 5. FINAL CLASS: Cannot be inherited (e.g., String class is final)
final class ImmutableClass {
    void show() {
        System.out.println("I cannot be extended");
    }
}

// class Child extends ImmutableClass { } // ERROR: Cannot inherit from final
// class

class Parent {
    // 6. FINAL METHOD: Cannot be overridden by child classes
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // void display() { } // ERROR: Cannot override the final method from Parent
}
