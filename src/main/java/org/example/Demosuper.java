package org.example;

class Animal {
    Animal() {
        System.out.println("Animal object is instantiated");
    }
    String color = "white";

    void eat() {
        System.out.println("Animal is eating meat");
    }
}

class Bat extends Animal {
    Bat() {
        super();
        System.out.println("Bat object is instantiated");
    }
    String color = "black";

    void eat() {
        super.eat();
        System.out.println("Animal is eating fruits");
    }

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class Demosuper {
    public static void main(String[] args) {
        // call all method
    }
}
