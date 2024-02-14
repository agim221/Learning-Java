package belajar.java.junit.injecttest;

import belajar.java.junit.Calculator;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

@Extensions(
        @ExtendWith(ClassInjectTest.class)
)
public class ClassInjectedParentTest {
    Calculator calculator = new Calculator();
}
