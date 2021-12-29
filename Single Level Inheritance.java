class Shape {
    public void area(){
        System.out.println("Displays Area !");
    }
}

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


}

public class Main {
    public static void main(String args[]) {
         Triangle t1 = new Triangle();
         
    }
}
