package belajar.java.junit.injecttest;

import belajar.java.junit.Calculator;
import org.junit.jupiter.api.*;
//import org.junit.jupiter.api;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;

public class ClassInjectedTest extends ClassInjectedParentTest{
//    @Test
    @RepeatedTest(value = 10, name = "{displayName} :: repetition {currentRepetition} of {totalRepetitions}")
    @DisplayName(value = "Test Rept")
    public void testApp(Random random, RepetitionInfo repetitionInfo) {
        System.out.println(repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        System.out.println(repetitionInfo.getClass());
        var a = random.nextInt();
        var b = random.nextInt();
        Assertions.assertEquals(a + b, calculator.add(a,b));
    }
}
