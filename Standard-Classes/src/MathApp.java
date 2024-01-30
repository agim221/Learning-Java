public class MathApp {
    public static void main(String[] args) {
        System.out.println(Math.abs(21));
        System.out.println(StrictMath.abs(21));
        System.out.println(Math.abs(21) == StrictMath.abs(21));
    }
}
