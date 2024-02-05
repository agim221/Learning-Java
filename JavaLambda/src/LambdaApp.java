import java.util.function.Predicate;

public class LambdaApp {
    public static void main(String[] args) {
//        LambdaInterface<String> lambdaInterface = name -> name;
//        System.out.println(lambdaInterface.hello("Agim"));

        Predicate<Boolean> predicate = s -> false;

        System.out.println(predicate.test(true));

    }
}
