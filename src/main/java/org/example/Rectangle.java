package org.example;

public class Rectangle extends ShapeAbstract{
    @Override
    void draw() {
        System.out.println("Draws rectangle");
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.draw();
    }
}
