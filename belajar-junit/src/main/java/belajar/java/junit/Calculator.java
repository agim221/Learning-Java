package belajar.java.junit;

public class Calculator {

    public float divide(float first, int second) {
        if(second == 0) {
            throw new IllegalArgumentException("Divide by zero");
        } else {
            return first / second;
        }
    }
    public int add(int first, int second) {
        return first + second;
    }
}
