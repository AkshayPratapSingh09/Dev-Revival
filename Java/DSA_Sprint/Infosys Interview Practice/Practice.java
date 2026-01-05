public class Practice{
    
    public static void main(String args[]){
        Person a = new Person("Akshay",21);
        System.out.println(a.printName());
        
    }

}

class Person{

    String name;
    int age;
    Person(String name,int age ){
        this.name = name;
        this.age = age;
    }

    String printName(){
        return this.name;
    }
}