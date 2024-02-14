package belajar.java.junit.injecttest;

import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import java.lang.reflect.Method;
import java.util.Random;

public class ClassInjectTest implements ParameterResolver {
    Random random = new Random();
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == Random.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return random;
    }

//    public static class CustomNameTest implements DisplayNameGenerator {
//        @Override
//        public String generateDisplayNameForClass(Class<?> aClass) {
//            return "Test class " + aClass.getName();
//        }
//
//        @Override
//        public String generateDisplayNameForNestedClass(Class<?> aClass) {
//            return null;
//        }
//
//        @Override
//        public String generateDisplayNameForMethod(Class<?> aClass, Method method) {
//            return "Test class " + aClass.getName() + " method " + method.getName();
//        }
//    }
}
