package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ChallengeTest {
    @Test
    public void test() {
        int a = new Random().nextInt(100);
        int b = new Random().nextInt(100);
        Challenge.a = a;
        Challenge.b = b;

        System.out.println("Before swap: a=" + a + ", b=" + b);

        Challenge.swap();

        Assertions.assertEquals(a, Challenge.b);
        Assertions.assertEquals(b, Challenge.a);
    }
}
