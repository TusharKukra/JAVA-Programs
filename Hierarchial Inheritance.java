class Shape {
    public void area(){
        System.out.println("Displays Area !");
    }
}

// Hierarchical inheritance: is a kind of inheritance where more than one class is inherited from a single parent or base class.
// In this example Base class Shape, inherited by two of its derived classes, i.e Triangle, Circle

class Triangle extends Shape {
    // i.e class inherits the properties of Shape also.
    public void area(int length, int height) {
        System.out.println("Area: "+(1/2*(lenght*height)))
    }

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape {
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}


}

public class Main {
    public static void main(String args[]) {
         Triangle t1 = new Triangle();
         
    }
}
