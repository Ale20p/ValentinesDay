package org.example;

final class FinalDemo1 {  // this class cannot be extended because of 'final'
    final int speedLimit = 100; // 'final' makes it unchangeable

    final void run() {   // cannot be used by child class because of 'final'
        System.out.println(speedLimit);
    }

    public static void main(String[] args) {
        FinalDemo1 f = new FinalDemo1();
        // f.speedLimit = 130;   // this doesn't work because of the final
        f.run();
    }
}
