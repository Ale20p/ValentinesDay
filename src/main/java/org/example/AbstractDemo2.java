package org.example;

abstract class Bank {
    abstract int getInterestRate();
}

class RBC extends Bank {

    @Override
    int getInterestRate() {
        return 7;
    }
}

class TD extends Bank {

    @Override
    int getInterestRate() {
        return 6;
    }
}
public class AbstractDemo2 {
    public static void main(String[] args) {
        Bank b;
        b = new RBC();
        System.out.println(b.getInterestRate());
        b = new TD();
        System.out.println(b.getInterestRate());
    }
}
