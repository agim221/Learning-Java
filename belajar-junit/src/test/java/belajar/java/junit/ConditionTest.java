package belajar.java.junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

@Tags(
        @Tag(value = "test-condition")
)
public class ConditionTest {
    @Test
    @DisabledOnOs(value = {OS.WINDOWS})
    void testOSDisabled() {

    }

    @Test
    @EnabledOnOs(value = {OS.WINDOWS})
    void testOSEnabled() {

    }

    @Test
//    @EnabledOnJre(value = {JRE.JAVA_17})
    void testJreEnabled() {

    }

    @Test
//    @DisabledOnJre(value = {JRE.JAVA_17})
    void testJreDisabled() {

    }

//    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
//    @EnabledIfEnvironmentVariables(
//            @EnabledIfEnvironmentVariable(named = "java.vendor", matches = "????")
//    )

//    @EnabledIfSystemProperties(
//            @EnabledIfSystemProperty(named = "java.vendor", matches = "????")
//    )
}
