public class inhertiance {
    public static void main(String args[]) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

// Base Class
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Animal is Walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

// class Dog extends Mammal {
//     String breed;
// }


// Dervied Class
// class Fish extends Animal {  // extends keyword is used to inherit from base class
//     int fins;

//     void swim() {
//         System.out.println("swims in water");
//     }
// }
