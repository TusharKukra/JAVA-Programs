interface Animal {

    // In Interface we can only use 3 Access Modifiers : Public, Static, Final

    // we cannot create constructor of Interfaces
    Animal(); // error

    void eat(){
        // In interfaces we cannot have any non-abstract functions (shows error while Runtime)
    }

    // we only define the funtion in the interface
    public void walk();
}

class Horse implements Animal {
    
    // here we can again implement the walk function
        public void walk() {
            System.out.println("Walks on 4 legs");
    }
}

public class Main {
    public static void main(String args[]) {
         
         Horse horse = new Horse();

         horse.walk();
    }
}
