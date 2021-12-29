class Student{
    String name;
    int age;

    // Polymorphism (Overloading : Compile-time Polymorphism)

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}


public class Main {
    public static void main(String args[]) {
         Student s = new Student();

         s.name = "ABC";
         s.age = 30;

         s.printInfo(s.name);
         s.printInfo(s.age);
         s.printInfo(s.name,s.age);
    }
}
