package belajar.java.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LyfeCycleTest {

    int test = 0;

    @Test
    public void add1() {
        test++;
        System.out.println(test);
    }

    @Test
    public void add2() {
        test++;
        System.out.println(test);
    }
}
