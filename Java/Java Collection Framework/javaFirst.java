import java.util.*;

public class javaFirst{

    public static void main(String[] args) {
        
        // LinkedList<Integer> l = new LinkedList<>();

        Animal Bhalu = new Animal(10);
        Aquatic fish = new Aquatic("Fish", 5);
        fish.getAge();
        fish.getName();

        Janwar first = new Janwar("Dog",10);

    }
}


class Animal{

    String name = "Bhalu";
    int age;

    public Animal( int age){
        this.name = name;
        this.age = age;
    }

    public void getName(){
        System.out.println(this.name);
    }
    public void getAge(){
        System.out.println(this.age);
    }
}

class Aquatic extends Janwar{

    public Aquatic(String name, int age) {
        // super(age);
    }
    
}

abstract class Janwar{

    String Name="Pehla Janwar";
    int age;

    Janwar(String name,int age ){
    this.Name = name;
    this.age = age;
    }

    String getName(){
        return this.Name;
    }
}