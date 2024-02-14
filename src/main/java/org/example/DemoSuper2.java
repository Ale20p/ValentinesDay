package org.example;

class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends Person {
    float salary;

    Employee(int id, String name, float salary)  {
        super(id, name);
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name  + " " + salary);
    }
}

public class DemoSuper2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(123, "Bob", 100000);
        emp1.display();
    }
}
