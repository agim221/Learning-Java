package belajar.java.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName(value = "Parent test")
public class NestedTest {

    @Nested
    public class insideParent {

        @Nested
        public class insideDoubleParent {
            @Test
            public  void testMethodDoubleInside() {

            }
        }

        @Test
        @DisplayName(value = "inside parent")
        public void testMethodInside(TestInfo info) {
            System.out.println(info.getTestMethod());
            System.out.println(info.getTestClass());
            System.out.println(info.getDisplayName());
        }
    }
}
