package com.bytelegend;

public class Challenge {
    public static int a = 1;
    public static int b = 2;

    public static void main(String[] args) {
        System.out.println("Before swap: a=" + a + ", b=" + b);
        swap();
        System.out.println("After swap: a=" + a + ", b=" + b);
    }

    // Complete this method
    public static void swap() {
        int c = this.b;
        this.a = this.b;
        this.b = c;
    }
}
