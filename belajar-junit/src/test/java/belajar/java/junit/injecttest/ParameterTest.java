package belajar.java.junit.injecttest;

import belajar.java.junit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

public class ParameterTest extends ClassInjectedParentTest{

    public static List<Integer> list() {
        return List.of(1,2,3,4,5,10);
    }

    @DisplayName("Test parameter")
    @ParameterizedTest(name = "{displayName} param {index} {0}")
//    @ValueSource(ints = {1, 2, 3, 4, 5})
    @MethodSource(value = {"list"})
    public void testApp(Integer value) {
        var result = value + value;
        var expect = calculator.add(value, value);

        Assertions.assertEquals(result, expect);
    }
}
