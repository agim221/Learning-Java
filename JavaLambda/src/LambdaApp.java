import java.util.function.Predicate;

public class LambdaApp {
    public static void main(String[] args) {
//        LambdaInterface<String> lambdaInterface = name -> name;
//        System.out.println(lambdaInterface.hello("Agim"));

        Predicate<Boolean> predicate = s -> true;
        Predicate<Boolean> predicate1 = predicate.and((s) -> true);

        System.out.println(predicate.test(true));
        System.out.println(predicate1.test(false));

    }
}
