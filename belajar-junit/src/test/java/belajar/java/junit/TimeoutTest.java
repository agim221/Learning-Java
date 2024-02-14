package belajar.java.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testApp() throws InterruptedException {
        Thread.sleep(4);
//        Thread.sleep(5);
    }
}
