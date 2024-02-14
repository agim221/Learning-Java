package belajar.java.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

@Execution(value = ExecutionMode.CONCURRENT)
public class ParalelTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testApp() throws InterruptedException {
        Thread.sleep(4_000);
//        Thread.sleep(5);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testApp1() throws InterruptedException {
        Thread.sleep(4_000);
//        Thread.sleep(5);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testApp2() throws InterruptedException {
        Thread.sleep(4_000);
//        Thread.sleep(5);
    }
}
