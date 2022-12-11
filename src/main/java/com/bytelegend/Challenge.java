package com.bytelegend;

public class Challenge {
    public static int a = 1;
    public static int b = 2;

    public static void main(String[] args) {
        System.out.println("Before swap: a=" + a + ", b=" + b);
        swap();
        System.out.println("After swap: a=" + a + ", b=" + b);
    }
    public static void swap() {
        int c;
        c = a;
        a = b;
        b = c;
    }
}
