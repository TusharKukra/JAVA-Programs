class Shape {
    String color;
}

class Triangle extends Shape {
    // i.e class inherits the properties of Shape also.
}

public class Main {
    public static void main(String args[]) {
         Triangle t1 = new Triangle();
         t1.color = "red";
    }
}
