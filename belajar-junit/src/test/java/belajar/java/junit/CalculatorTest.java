package belajar.java.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.opentest4j.TestAbortedException;

//@DisplayNameGeneration(value = CustomNameTest.class)
//@Tags(
//        @Tag(value = "calculator")
//)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @BeforeEach
    void beforeEachTest() {
        System.out.println("before executed");
    }

    @AfterEach
    void aftterEachTest() {
        System.out.println("after executed");
    }

    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("Before All executed");
    }

    @AfterAll
    public static void afterAllTest() {
        System.out.println("After all executed");
    }

    @Test
//    @Order(1)
//    @DisplayName("Test pertambahan")
    void addTest() {
        int result  = calculator.add(3, 3);
        Assertions.assertEquals(6, result);
    }

    @Test
    void divideFailedTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           calculator.divide(3, 0);
        });
    }

    @Test
    void divideSuccessTest() {
        Assertions.assertEquals(1, calculator.divide(3,3));
    }

    @Test
    @Disabled
    void comingSoon() {

    }

    @Test
    void testAbortedException() {
        String env = System.getenv("PROFILE");
        if(!env.equals("DEV")) {
            throw new TestAbortedException("Bukan DEV");
        }
    }

    @Test
    void testAssumptions() {
        Assumptions.assumeFalse("DEV".equals(System.getenv("PROFILE")));
    }


}
