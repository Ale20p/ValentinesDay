package org.example;

import java.util.Scanner;

abstract class shape1 {
    int height = 0;
    int width = 0;

    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }

    abstract int getArea();
}

class Hexagon extends shape1 {

    @Override
    int getArea() {
        return getHeight() * getWidth();
    }
}

class Octagon extends shape1 {
    int side = 8;

    public void setSide(int side) {
        this.side = side;
    }
    public int getSide() {
        return side;
    }

    @Override
    int getArea() {
        return getSide() * getSide();
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        shape1 shape = null;
        System.out.println("Area of shape");
        System.out.println("1. Hexagon  2. Octagon");
        int choice = console.nextInt();
        switch (choice) {
            case 1:
                shape = new Hexagon();
                System.out.println("Height of the Hexagon");
                int height = console.nextInt();
                System.out.println("Width of the Hexagon");
                int width = console.nextInt();
                shape.setHeight(height);
                shape.setWidth(width);
                System.out.println("Area of the Hexagon");
                break;

            case 2:
                Octagon c = new Octagon();
                shape = c;
                System.out.println("Side of the Octagon");
                int side = console.nextInt();
                c.setSide(side);
                System.out.println("Area of the Octagon");
                break;
            default:
                break;
        }
        System.out.println(shape.getArea());
        console.close();
    }
}
