import java.util.*;

public class sortObject {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(10,"Aarav"));
        list1.add(new Student(110,"Manav"));
        list1.add(new Student(121,"Gaurav"));
        list1.add(new Student(1,"Gaur"));
        list1.add(new Student(5,"Bahadur"));
        list1.add(new Student(15,"Durshan"));
        list1.add(new Student(15,"Arpan"));
        list1.add(new Student(20,"shan"));
        
        // System.out.println(list1);
        for (Student i : list1){
            System.out.println(i.rollNumber+" -> "+i.name);
        }
        
        
        list1.sort( new Comparator<Student>() {

            public int compare(Student A, Student B){
                
                // If two students have same roll number
                int res = B.rollNumber - A.rollNumber;
                
                // Lexographical Comparison
                if(res == 0) return A.name.compareTo(B.name);
                
                return A.rollNumber - B.rollNumber;
            }
        });
        System.out.println("After Sorting\n");
        for (Student i : list1){
            System.out.println(i.rollNumber+" -> "+i.name);
        }

    }

}


class Student{
    String name;
    int rollNumber;

    public Student(int rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }
}