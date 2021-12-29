class Student {
    String name;

    // for every student in a School, the school name is same, so we create a Static variable
    static String school;  // common for all objects

}

public class Main {
    public static void main(String args[]) {
        
        // for accessing the Static variables and methods : we user className.variable
        Student.school = "ABC";  // this will update value of variable for all students 

        Student student1 = new Student();
        student1.name = "XYZ";

        System.out.println(student1.school);

    }
}
