abstract class Animal {
    abstract void walk();

    Animal(){
        System.out.println("Animal Constructor called");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }

    Horse(){
        System.out.println("Horse Constructor called!!");
    }
}

class Duck extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}


public class Main {
    public static void main(String args[]) {
         
         Horse horse = new Horse();

        // when we call constructor of Horse , then first it will call constructor of its Base Class, then its own Constructor (Constructor Chaining)

         horse.walk();
    }
}
